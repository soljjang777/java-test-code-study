package sample.cafekiosk.spring.domain.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ProductTypeTest {

    @DisplayName("상품 타입이 재고 관련 타입이 아니라면 false 반환.")
    @Test
    void containsStockType() {
        //given
        ProductType productType = ProductType.HANDMADE;

        //when
        boolean result = ProductType.containStockType(productType);

        //then
        assertThat(result).isFalse();
    }

    @DisplayName("상품 타입이 재고 관련 타입이 이라면 true 반환.")
    @Test
    void containsStockType2() {
        //given
        ProductType productType = ProductType.BAKERY;

        //when
        boolean result = ProductType.containStockType(productType);

        //then
        assertThat(result).isTrue();
    }

}