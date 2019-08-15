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
public class BitcoinModel implements Serializable {

	private static final long serialVersionUID = 1L;

        private String id;
	private String fromToken;
	private String toToken;
	private Double amount;

	
}
