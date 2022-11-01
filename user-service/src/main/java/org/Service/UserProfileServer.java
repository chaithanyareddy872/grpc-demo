package org.Service;
import io.grpc.stub.StreamObserver;
import org.example.ChannelCreate;
import org.grpc.generated.UpdateServiceGrpc;
import org.grpc.generated.Userprofile;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserProfileServer extends UpdateServiceGrpc.UpdateServiceImplBase {

    ChannelCreate channelCreate = new ChannelCreate();
    @Override
    public void updateFirstName(Userprofile.firstName request, StreamObserver<Userprofile.Response> responseObserver) {
        String updatedFirstName = request.getFirstname();
        int id = request.getId();
        DatabaseService databaseService = new DatabaseService();
        Userprofile.Profile  profile = null;
        try {
            profile = databaseService.updateFirstName(updatedFirstName,id);
            channelCreate.connetToNoty5(id);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Userprofile.Response.Builder response = Userprofile.Response.newBuilder();
        if(profile != null){
            response.setStatusCode(200);
            response.setResponseMessage("Success");
            response.setProfile(profile);
        }else{
            response.setStatusCode(404);
            response.setResponseMessage("Profile Not Found");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
    @Override
    public void updateLastName(Userprofile.lastName request, StreamObserver<Userprofile.Response> responseObserver) {
        String updatedLastName = request.getLastname();
        int id = request.getId();
        String email = null;
        DatabaseService databaseService = new DatabaseService();
        Userprofile.Profile  profile = null;
        try {
            profile = databaseService.updateLastName(updatedLastName,id);
            channelCreate.connetToNoty5(id);

//            email = databaseService.getEmailFromId(id);
//            EmailClient emailClient = new EmailClient();
//            emailClient.sendEmail(email,"Updation Successful","From Music Mantra Team");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Userprofile.Response.Builder response = Userprofile.Response.newBuilder();
        if(profile != null){
            response.setStatusCode(200);
            response.setResponseMessage("Success");
            response.setProfile(profile);
        }else{
            response.setStatusCode(404);
            response.setResponseMessage("Profile Not Found");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
    @Override
    public void updateContact(Userprofile.contact request, StreamObserver<Userprofile.Response> responseObserver) {
        String updatedContact = request.getContact();
        int id = request.getId();
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(updatedContact);
        boolean res = matcher.matches();
        DatabaseService databaseService = new DatabaseService();
        Userprofile.Profile  profile = null;
        Userprofile.Response.Builder response = Userprofile.Response.newBuilder();
        if(res == true) {
            try {
                profile = databaseService.updateContact(updatedContact, id);
                channelCreate.connetToNoty5(id);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            if(profile != null){
                response.setStatusCode(200);
                response.setResponseMessage("Success");
                response.setProfile(profile);
            }else{
                response.setStatusCode(404);
                response.setResponseMessage("Profile Not Found");
            }
        }else {
            response.setStatusCode(400);
            response.setResponseMessage("Please provide a valid 10 digit no!");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
    @Override
    public void updateAddress(Userprofile.Address request, StreamObserver<Userprofile.Response> responseObserver) {
        String updatedCity = request.getCity();
        String updatedPincode = request.getPinCode();
        String updatedState = request.getState();
        int id = request.getId();
        DatabaseService databaseService = new DatabaseService();
        Userprofile.Profile  profile = null;
        try {
            profile = databaseService.updateAddress(updatedCity,updatedPincode,updatedState,id);
            channelCreate.connetToNoty5(id);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Userprofile.Response.Builder response = Userprofile.Response.newBuilder();
        if(profile != null){
            response.setStatusCode(200);
            response.setResponseMessage("Success");
            response.setProfile(profile);
        }else{
            response.setStatusCode(404);
            response.setResponseMessage("Profile Not Found");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
    @Override
    public void updatePreference(Userprofile.Preference request, StreamObserver<Userprofile.Response> responseObserver) {
        List<String> genre = request.getGenreList();
        List<String> instrument = request.getIntrumentList();
        int id = request.getId();
        String[] prefer = new String[genre.size()];
        prefer = genre.toArray(prefer);
        String[] insmt = new String[instrument.size()];
        insmt = instrument.toArray(insmt);
        DatabaseService databaseService = new DatabaseService();
        Userprofile.Profile  profile = null;
        try {
            profile = databaseService.updatePreference(prefer,insmt,id);
            channelCreate.connetToNoty5(id);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Userprofile.Response.Builder response = Userprofile.Response.newBuilder();
        if(profile != null){
            response.setStatusCode(200);
            response.setResponseMessage("Success");
            response.setProfile(profile);
        }else{
            response.setStatusCode(404);
            response.setResponseMessage("Profile Not Found");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
    @Override
    public void updatePassword(Userprofile.password request, StreamObserver<Userprofile.Response> responseObserver) {
        String updatedPassword = request.getPassword();
        int id = request.getId();
        DatabaseService databaseService = new DatabaseService();
        Userprofile.Profile  profile = null;
        try {
            profile = databaseService.updatePassword(updatedPassword,id);
            channelCreate.connetToNoty5(id);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Userprofile.Response.Builder response = Userprofile.Response.newBuilder();
        if(profile != null){
            response.setStatusCode(200);
            response.setResponseMessage("Success");
            response.setProfile(profile);
        }else{
            response.setStatusCode(404);
            response.setResponseMessage("Profile Not Found");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getProfileById(Userprofile.GetProfileReq request, StreamObserver<Userprofile.GetProfileResp> responseObserver) {
        int id=request.getUserid();

        DatabaseService service=new DatabaseService();

        Userprofile.GetProfileResp.Builder response;

        response=service.getUser(id);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }
}
