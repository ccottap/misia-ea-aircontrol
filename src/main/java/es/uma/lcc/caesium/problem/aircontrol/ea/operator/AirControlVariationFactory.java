package es.uma.lcc.caesium.problem.aircontrol.ea.operator;

import java.util.List;

import es.uma.lcc.caesium.ea.operator.variation.VariationFactory;
import es.uma.lcc.caesium.ea.operator.variation.VariationOperator;

/**
 * User-defined factory for operators specific for the Air Control problem
 * @author ccottap
 * @version 1.0
 */
public class AirControlVariationFactory extends VariationFactory {

	@Override
	public VariationOperator create (String name, List<String> pars) {
		VariationOperator op = null;
				
		switch (name.toUpperCase()) {

		default:
			op = super.create(name, pars);
		}
				
		return op;
	}

}
