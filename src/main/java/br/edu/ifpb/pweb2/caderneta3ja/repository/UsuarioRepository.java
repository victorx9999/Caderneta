package br.edu.ifpb.pweb2.caderneta3ja.repository;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.Selection;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.pweb2.caderneta3ja.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	// Implementação feita pelo próprio Spring Boot
	
	Usuario findByEmail(String email);
	

//	List<Usuario> findByPerfil(String perfil);
//	List<Usuario> findBytipo(String tipo);

	@org.springframework.data.jpa.repository.Query("select c from Usuario c where c.perfil='ALUNO'")
	List<Usuario> findByPerfil(String perfil);
	
	@org.springframework.data.jpa.repository.Query("select c from Usuario c where c.perfil='PROFESSOR'")
	List<Usuario> findByPerfilProfessor(String perfil);
	

//		static Usuario createQuery(String email) {
//			Query q = (Query) createQuery("from Usuario u where u.email = :email");
//			q.setParameter("email", email);
//			return (Usuario) q.getSingleResult();
//		}
		
//		Usuario query = (Usuario) createQuery("from Usuario u where u.email = :email");

//		Query query = createQuery("from Usuario u where u.email = :email");


}
