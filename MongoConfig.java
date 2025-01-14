import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages = "com.yourpackage.repository")
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "ReactDatabase"; // Replace with your MongoDB database name
    }

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb+srv://mithilesh:password5555@eaiesb.i83cqcj.mongodb.net/"); // Replace with your MongoDB connection URL
    }
}
