package app;

import javax.ws.rs.FormParam;
import org.jboss.resteasy.annotations.providers.multipart.PartType;

public class FileUploadForm {

    private byte[] data;
    private String fileName;

    public FileUploadForm() {
    }

    public byte[] getData() {
        return data;
    }

    @FormParam("fileFormAttribute")
    @PartType("application/octet-stream")
    public void setData(byte[] data) {
        this.data = data;
    }

    public String getFileName() {
        return fileName;
    }

    @FormParam("fileNameFormAttribute")
    @PartType("text/plain")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}