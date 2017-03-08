package mongo;

import com.mongodb.DBObject;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

/**
 * Created by RENT on 2017-03-08.
 */
public class Main {
    public static void main(String[] args) {
        PostsDAO dao = new PostsDAO();

        Post post = new Post();
        post.setAuthor("Sykstys");
        post.setContent("Tresc z parametru");
        post.setDate(new Date());
        dao.insert(post);

        List<DBObject> results = dao.searchById(new ObjectId("58c050fe1fd2b711f0fb3c1d"));

        Post post2 = new Post();
        post2.setAuthor("Sykstys cycuch");
        post2.setContent("Tresc z parametru NOWA");
        post2.setDate(new Date());

        dao.update(post2, new ObjectId("58c03c4f4f97bc4c050f0a7f"));


        dao.removeById(new ObjectId("8c05af01fd2b7082c54cf2a"));
        System.out.println("");
    }
}
