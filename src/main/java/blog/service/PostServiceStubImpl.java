/**
 * 
 */
package blog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import blog.medel.Post;

/**
 * @author khunga
 *
 */
@Service
public class PostServiceStubImpl implements PostService	 {

	private List<Post> posts = new ArrayList<>();
			
	@Override
	public List<Post> findAllPosts() {
		// TODO Auto-generated method stub
		return posts;
	}

	@Override
	public List<Post> findRecent7Posts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post finfPostById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post editPosts(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePostById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
