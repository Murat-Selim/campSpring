package kodlamaio.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaio.rentACar.dataAccess.abstracts.BrandRepository;
import kodlamaio.rentACar.entities.concretes.Brand;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
	
	List<Brand> brands;

	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1, "BMW"));
		brands.add(new Brand(2, "Mercedes"));
		brands.add(new Brand(3, "Audi"));
		brands.add(new Brand(4, "Fiat"));
		brands.add(new Brand(5, "Renault"));
	}

	@Override
	public List<Brand> getAll() {

		return brands;
	}

}