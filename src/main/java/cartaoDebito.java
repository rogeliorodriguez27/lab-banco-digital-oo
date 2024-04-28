import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.util.Date;

@Setter
@Getter
public class cartaoDebito {

    private String numbers;
    private Date validade;
    private int segurityCode;
}