package app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

@Path("test")
public class UploadFileService {

    @POST
    @Path("upload/")
    @Consumes("multipart/form-data")
    public String uploadFile(@MultipartForm FileUploadForm formData) {
        String fileName = "C:\\Users\\USERNAME\\Desktop\\Upload_Files\\" + formData.getFileName() + ".extension";

//        try {
//            writeFile(formData.getData(), fileName);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        return formData.getFileName();
    }

    private void writeFile(byte[] content, String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write(content);
        outputStream.flush();
        outputStream.close();
    }
}