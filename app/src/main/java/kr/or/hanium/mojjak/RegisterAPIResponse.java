package kr.or.hanium.mojjak;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterAPIResponse {
    @SerializedName("result")
    @Expose
    private Boolean result;

    public Boolean getResult() {
        return result;
    }
}
