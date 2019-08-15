package io.project.app.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaypalModel implements Serializable {

    private static final long serialVersionUID = -7408851479146003262L;

    private String id;
    private String fromAccount;
    private String toAccount;
    private Integer amount;

}
