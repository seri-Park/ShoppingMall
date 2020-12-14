package ci.jvision.admin201818049.domain.products;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @Column(nullable = false)
    private String p_id;

    @Column( nullable = false)
    private String p_name;

    @Column(columnDefinition="NUMBER", nullable = false)
    private String p_price;

    @Column(length=500, nullable = true)
    private String p_desc;

    @Builder
    public Products(String p_name, String p_price, String p_desc)
    {
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_desc = p_desc;
    }
}
