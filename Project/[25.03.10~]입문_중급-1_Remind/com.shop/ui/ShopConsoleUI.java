package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import model.cart.Cart;
import model.cart.CartItem;
import model.product.Category_Enum;
import model.product.Product;
import model.user.User;
import service.*;

/*
 * 콘솔 기반 사용자 인터페이스 클래스
 *
 * 구현 방법:
 * 1. Scanner 객체로 사용자 입력 처리
 * 2. 각 서비스 클래스의 인스턴스 참조
 * 3. 메인 메뉴 표시 및 처리 메서드 구현
 * 4. 상품 목록 표시 메서드 구현
 * 5. 상품 상세 정보 표시 메서드 구현
 * 6. 장바구니 표시 및 관리 메서드 구현
 * 7. 주문 과정 안내 메서드 구현
 * 8. 결제 처리 메서드 구현
 * 9. 사용자 로그인/등록 메서드 구현
 * 10. 입력값 검증 및 예외 처리 메서드 구현
 */

public class ShopConsoleUI {
    public static void main(String[] args) throws Exception {
//        버퍼 리더 호출
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isEndRoop = false;
//        * 3. 메인 메뉴 표시 및 처리 메서드 구현
        while (!isEndRoop) {
            displayMainMenu();
            String choice = reader.readLine();


        }
    }

    public static void displayMainMenu() {
        System.out.println("안녕하세요! 오늘도 저희 클릭스에 방문하신것을 환영합니다!");
        System.out.println("어떤 기능을 이용하시겠어요?");
        System.out.println("1. 사용자 정보 관리");
        System.out.println("2. 장바구니 관리");
        System.out.println("3. 상품 관리");
        System.out.println("4. 주문 내역 관리");
        System.out.println("-- 원하시는 기능의 번호를 입력해주세요! ex)1번 or 1 --");
    }

    public static Object returnService(String choice) {
        //         * 2. 각 서비스 클래스의 인스턴스 참조
//        서비스 인스턴스 호출
        UserService userService = UserService.getUserService();
        OrderService orderService = OrderService.getOrderService();
        if (choice.contains("1")) {
//        사용자 정보 관리
            return userService;
        } else if (choice.contains("2")) {
//      장바구니 관리
        } else if (choice.contains("3")) {
//      상품 관리

        } else if (choice.contains("4")) {
//      주문 관리
            return orderService;
        } else {
            System.out.println("올바른 값을 입력해주세요!");
        }
        return null;
    }

    //    * 4. 상품 목록 표시 메서드 구현
    public static void productListDisplay() {
        ProductService productService = ProductService.getProductService();

        ArrayList<Product> productList = productService.getProductList();
        if (!productList.isEmpty()) {
            System.out.println(" == 상품 목록 == ");
            for (Product product : productService.getProductList()) {
                for (int i = 0; i < productList.size(); i++) {
                    System.out.println((i + 1) + "번 상품 : " + product.getName());
                }
            }
            System.out.println(" == 상품 목록 출력 종료 == ");
        } else {
            System.out.println("등록된 상품이 없습니다.");
        }
    }


    //    * 5. 상품 상세 정보 표시 메서드 구현
    public static void productInfoDisplay() {
        ProductService productService = ProductService.getProductService();

        ArrayList<Product> productList = productService.getProductList();
        if (!productList.isEmpty()) {
            System.out.println(" == 상품 상세 정보 == ");
            for (Product product : productService.getProductList()) {
                System.out.println(product.toString());

            }
            System.out.println(" == 상품 상세 정보 출력 종료 == ");
        } else {
            System.out.println("등록된 상품이 없습니다.");
        }
    }

    //* 6. 장바구니 표시 및 관리 메서드 구현
    public static void displayCart() {
        CartService cartService = CartService.getCartService();
        ArrayList<Cart> cartList = cartService.getCartArrayList();
        if (!cartList.isEmpty()) {
            System.out.println("== 장바구니입니다! ==");
            for (Cart cart : cartList) {
                cart.displayCart();
            }
            System.out.println("== 장바구니 표시 종료 ==");
        }
    }

    //    if vs try - catch
    public static boolean cartManagers(User user, BufferedReader reader) throws Exception {
        if (UserService.getUserService().checkNull(user)) {
            System.out.println("입력값이 올바르지 않습니다.");
            return false;
        }
        //        어떤 사용자의 장바구니에 추가할지 > 사용자 검증
        if (UserService.getUserService().checkLoginData(user)) {
            System.out.println("사용자 검증 완료");
        } else {
            System.out.println("사용자 검증 실패");
            return false;
        }
//        장바구니 찾기
        Cart cart = CartService.getCartService().findCart(user);
        if (cart == null) {
            cart = new Cart(user.getMemberId());
            System.out.println("징바구니 생성이 완료되었습니다.");
        } else {

        }


//        상품 정보 입력 받기
        ArrayList<Object> productInfos = new ArrayList<>();
        Category_Enum newProductCategoryName = null;
        System.out.println("-- 상품 정보 입력 -- ");
        System.out.println("추가할 상품의 아이디를 입력해주세요");
        String newProductId = reader.readLine();
        productInfos.add(newProductId);
        System.out.println("추가할 상품명을 입력해주세요");
        String newProductName = reader.readLine();
        productInfos.add(newProductName);
        System.out.println("추가할 가격을 입력해주세요");
        int newProductPrice = Integer.parseInt(reader.readLine());
        productInfos.add(newProductPrice);
        System.out.println("추가할 카테고리를 입력해주세요");
        String newProductCategory = reader.readLine();
        productInfos.add(newProductCategory);
        System.out.println("-- 상품 정보 검증 시작 --");
        for (int i = 0; i < productInfos.size(); i++) {
            if (!checkValue(productInfos.get(i))) {
                System.out.println("검증에 실패하였습니다. 다시 시도해 주세요");
                return false;
            }
        }
        newProductCategoryName = matchForCategory(newProductCategory);
        System.out.println("-- 상품 정보 검증 완료 --");

//        상품 객체 생성 하기
        Product newProduct = new Product(newProductId, newProductName, newProductPrice, 3, newProductCategoryName);

//        상품 > 카트 아이템으로 변환 > 카트에 추가
        CartService cartService = CartService.getCartService();
        CartItem cartItem = new CartItem(newProduct, 1);
//        아직 실질적 주문완료 상태가 아니기에 아래 코드는 아직은 불필요
//        for (int i = 0; i < cartItem.getStockCount(); i++) {
//        cartItem.countReduction();
//        }
        cart.addItem(newProduct, 1);

        System.out.println("== 장바구니 관리 종료 ==");
        return true;
    }


    public static boolean checkValue(Object value) {
        if (value instanceof String str) {
            if (str.isEmpty()) {
                System.out.println("상품명이나 상품 아이디의 입력값이 올바르지 않습니다.");
                return false;
            }
        } else if (value instanceof Integer nums) {
            if (nums == 0 || nums < 0) {
                System.out.println("상품 가격이나, 재고의 값이 올바르지 않습니다.");
                return false;
            }
        }
        System.out.println("입력값 검증에 성공하였습니다.");
        return true;
    }

    public static Category_Enum matchForCategory(String target) {
        Category_Enum categoryEnum = null;
        if (target.contains("전자")) {
            categoryEnum = Category_Enum.ELECTRONICS;
        } else if (target.contains("의류")) {
            categoryEnum = Category_Enum.CLOTHING;
        } else if (target.contains("음식") || target.contains("식") || target.contains("식품")) {
            categoryEnum = Category_Enum.FOOD;
        } else if (target.contains("도서") || target.contains("책")) {
            categoryEnum = Category_Enum.BOOKS;
        }
        if (categoryEnum == null) {
            System.out.println("카테고리명이 올바르지 않습니다.");
        }
        return categoryEnum;
    }
}
