package kodlamaio.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlamaio.rentACar.core.utilities.exceptions.BusinessException;
import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
	private BrandRepository brandRepository;
	
	public void checkIfBrandNameExists(String name) {
		if(this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists"); //Java exception types
		}
	}

}
