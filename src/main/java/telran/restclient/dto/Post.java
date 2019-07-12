package telran.restclient.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Post {

	int userId;
	int id;
	String title;
	String body;

}
