/**
 * 
 */
package blog.service;

import java.util.List;

import blog.medel.Post;

/**
 * @author khunga
 *
 */
public interface PostService {

	List<Post> findAllPosts();

	List<Post> findRecent7Posts();

	Post finfPostById(Long id);

	Post createPost(Post post);

	Post editPosts(Post post);

	void deletePostById(Long id);

}
