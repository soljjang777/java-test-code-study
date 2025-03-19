package sample.cafekiosk.spring.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
// JPA 엔티티의 공통 부모 클래스로 지정
// @MappedSuperclass가 적용된 클래스 자체는 테이블이 생성되지 않으며, 상속받는 하위 엔티티가 이 클래스의 필드를 상속받아 사용할 수 있음
// @MappedSuperclass와 함께 abstract를 사용하여 테이블이 생성되지 않도록 하고, 하위 엔티티만 테이블을 가질 수 있도록 강제함
@MappedSuperclass
// JPA의 감사(Auditing) 기능을 활성화
// JPA의 감사(Auditing) 기능 : 엔티티의 생성 시간, 수정 시간, 작성자, 수정자 등과 같은 변경 이력 정보를 자동으로 관리하는 기능
@EntityListeners(AuditingEntityListener.class)
// 인스턴스로 만들 필요가 없어서 추상클래스로 생성 (상속을 통해서만 사용할 수 있도록 제한)
public abstract class BaseEntity {

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;
}
