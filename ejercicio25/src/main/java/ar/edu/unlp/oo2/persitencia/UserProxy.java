package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class UserProxy implements PersistableUser {
	User usuario;
	PostRepository repositorio;
	
	public UserProxy (User usuario) {
		this.usuario = usuario;
		repositorio = new PostRepository();
	}
	
	@Override
	public String getUsername() {
		return usuario.getUsername();
	}

	@Override
	public String getEmail() {
		return usuario.getEmail();
	}

	@Override
	public List<Post> getPosts() {
		return repositorio.findPostsByUsername(this.getUsername());
	}

}
