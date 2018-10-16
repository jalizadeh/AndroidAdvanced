package jalizadeh.com.androidadvanced.RetrofitJSON.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import jalizadeh.com.androidadvanced.RetrofitJSON.Model.Children.Children;

public class Data {

    @SerializedName("modhash")
    @Expose
    private String modhash;

    @SerializedName("children")
    @Expose
    private ArrayList<Children> children;


    public String getModhas() {
        return modhash;
    }

    public void setModhas(String modhas) {
        this.modhash = modhas;
    }

    public ArrayList<Children> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Children> children) {
        this.children = children;
    }


    @Override
    public String toString() {
        return "Data{" +
                "modhas='" + modhash + '\'' +
                ", children=" + children +
                '}';
    }
}
