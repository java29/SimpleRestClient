package telran.restclient.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import telran.restclient.dto.Post;

public class RestClientAppl {

	public static void main(String[] args) throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		RequestEntity<String> request = new RequestEntity<>(HttpMethod.GET, 
				new URI("https://jsonplaceholder.typicode.com/posts"));
		ResponseEntity<List<Post>> response = 
				restTemplate.exchange(request, new ParameterizedTypeReference<List<Post>>() {
				});
//		List<Post> posts = response.getBody();
//		posts.stream().forEach(System.out::println);
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeaders().getContentType());
		System.out.println(response.getHeaders().get("X-Content-Type-Options"));
	}

}
