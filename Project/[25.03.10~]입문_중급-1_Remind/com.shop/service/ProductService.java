package service;

import java.time.LocalDateTime;

/*
 * 상품 관련 비즈니스 로직을 처리하는 서비스 클래스
 *
 * 구현 방법:
 * 1. 싱글톤 패턴 적용 (인스턴스를 하나만 생성하여 공유)
 * 2. 상품 목록을 ArrayList<Product>로 관리
 * 3. 상품 추가 메서드 구현
 * 4. 상품 삭제 메서드 구현
 * 5. 상품 업데이트 메서드 구현
 * 6. ID로 상품 검색 메서드 구현
 * 7. 이름으로 상품 검색 메서드 구현 (부분 일치 검색)
 * 8. 카테고리별 상품 필터링 메서드 구현
 * 9. 가격 범위로 상품 필터링 메서드 구현
 * 10. 상품 정렬 메서드 구현 (가격 오름차순/내림차순)
 */

public class ProductService {
private String reviewId;
private String userId;
private String productId;
private String reviewContent;
private LocalDateTime reviewDates;

}
