package io.codetour.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.codetour.domain.coordenador.Coordenador;
import io.codetour.domain.coordenador.CoordenadorRepository;

@RestController
@RequestMapping("/coordenador")
public class CoordenadorResource {
	
		private CoordenadorRepository coordenadorRepository;
		
		public CoordenadorResource (CoordenadorRepository coordenadorRepository) {
			this.coordenadorRepository = coordenadorRepository;
		}
		
		@GetMapping
		public Iterable<Coordenador>getAllCoordenador() {
			return coordenadorRepository.findAll();
		}
		
		@GetMapping(value="/{id}")
		public Coordenador getByName(@PathVariable Long id) {
			return coordenadorRepository.findOne(id);
		}
		
		@PostMapping
		public Coordenador saveCoordenador(@RequestBody Coordenador coordenador) {
			return coordenadorRepository.save(coordenador);
		}
		
		@PutMapping(value="/{id}")
		public Coordenador updateCoordenador(@PathVariable Long id, @RequestBody Coordenador coordenador) {
			return coordenadorRepository.save(coordenador);
		}
		
		@DeleteMapping(value="/{id}")
		public void removeCoordenador(@PathVariable Long id) {
			coordenadorRepository.delete(id);
		}
		
}
