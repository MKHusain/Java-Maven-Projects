package S3_Connectivity;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

import java.io.File;
import java.util.List;

public class AWSBucket {

    public static void main(String[] args) {

        // Creating Bucket Name Variable.
        String bucketName = "Enter your bucket Name";

        // Creating Bucket Credientials
        String accesskey = "Enter Your S3 Access Key";
        String secretkey = "Enter Your S3 Secret Key";

        AWSCredentials credentials = new BasicAWSCredentials(accesskey, secretkey);

        AmazonS3 s3client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();

        // Listing the objects in a S3 Bucket
        //showBuckets(s3client);

        s3client.putObject(bucketName, "Enter your file name", new File("Enter your file Path here"));

        }



    public static void showBuckets(AmazonS3 client) {


        List<Bucket> buckets = client.listBuckets();
        for (Bucket bucket : buckets) {
            System.out.println(bucket.getName());

        }
    }


}

