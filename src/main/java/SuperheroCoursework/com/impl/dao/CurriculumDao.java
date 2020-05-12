package SuperheroCoursework.com.impl.dao;


import SuperheroCoursework.com.Model.Curriculum.Curriculum;

public class CurriculumDao {

   // Database database;
    public static String get_curriculum = "SELECT * FROM CURRICULUM";
    public static String get_objective = "SELECT * FROM OBJECTIVE WHERE OBJECTIVE_NAME = ?";

    public Curriculum getCurrriculum() {
       // TODO: use query and map values
        return null;
    }

    public void getStorageConnection() {
//        String connString = "DefaultEndpointsProtocol=https;AccountName=superherostorageaccount;AccountKey=6T91N9ce/z7KliRQZ3pOj5weAsgkmAO/RyS1UUGWlBpecFyY/BezKZfJx4K+FJZanfRI9mjcYcKcX9cwTFVyJw==;EndpointSuffix=core.windows.net";
//// Parse the connection string and create a blob client to interact with Blob storage
//        StorageSharedKeyCredential credential = new StorageSharedKeyCredential(accountName, accountKey);
//        BlobServiceClient storageAccount = CloudStorageAccount.parse(connString);
//        blobClient = storageAccount.createCloudBlobClient();
//        container = blobClient.getContainerReference("suerherocoursework");
//
//// Create the container if it does not exist with public access.
//        System.out.println("Creating container: " + container.getName());
//        container.createIfNotExists(BlobContainerPublicAccessType.CONTAINER, new BlobRequestOptions(), new OperationContext());
    }


    //example
    public String getObjectiveByName(String objectiveName) {
        //TODO: use query
        return "-I can explain how superman became earthly."+
         "\n-I can identify superman's birthplace and his origin story (where is home?; why is home important?)"+
         "\n-I can identify why superman's birthplace influences him differently than my own."+
         "\n-I can explain the natural disaster occurring on krypton."+
                "\n-I can identify how the permanent destruction of superman’s home influences him."+
                "\n-I can identify how the loss of superman's parents influences him. "+
                "\n-I can explain why superman's family sent him to earth. "+
                "\n-I can explain why the Kents adopted Kal-El."+
                "\n-I can identify who was left behind on the planet krypton."+
                "\n-I can explain how superman paved the way for future refugees (Supergirl, Power girl, Krypto the super dog)."+
                "\n-I can explain how Supergirl, Krypto the dog, Power girl carry on the culture of krypton (or did not?)"+
                "\n-I can identify how superman adapted to his surroundings after landing on earth (Midwest)"+
                "\n-I can explain why superman adapted to his surroundings after landing on earth (Midwest)"+
                "\n-I can think about why the Kents would want to conceal where superman came from."+
                "\n-I can explain why the costumed identity of superman is used at certain times."+
                "\n-I can explain why Clark Kent can participate in certain situations and superman can not (vice versa)"+
                "\n-I can explain why Clark Kent avoids violent confrontation and goes and gets help (superman)"+
                "\n- I can explain why Clark Kent chooses to avoid violent confrontation in order to  get help."+
                "\n-I can explain how Clark Kent identifies when to get help."+
                "\n-I can explain why Clark Kent is never shameful of getting help."+
                "\n-I can explain how I identify when to get help and from whom."+
                "\n-I can explain how superman feels alienated on earth (no one he shares culture with)."+
                "\n-I can identify superman's powers and abilities: flight, strength, speed, vision powers, hearing, intelligence, super breath. "+
                "\n-I can identify why Superman uses certain powers over others in certain situations."+
                "\n-I can explain why Superman uses one particular power/ability over another in a certain situation."+
                "\n-I can explain why Superman uses particular powers against specific foes (when do you use your powers in certain situations: listen, talk, run, creatively think, participate, self-regulate)."+
                "\n-I can identify who Superman sees as villains: wife beaters, gangsters, corrupt politicians-->super villains: ultra-humanite, Lex Luthor, mister Mxyzptlk, Brainiac(alien) Doomsday).";

    }

}
