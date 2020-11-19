/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped


public class MSR_Base {
    
    private String name;
    private String ads;
    private String adss;
    private String sex;
    private Integer blood;
    private Integer phoneno;
    private Date date;
    private Integer comno;
    private String comname;
    private Integer comprice;
    private Integer comnu;
    private String savor; 
    private String sport;
    private String dome;
    private String international;
    private String music;
    private String games;
    private String shop;
    private String selectItem;
    private String[] selectValue;
    
    // **** Setter& Getter ****

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAds() {
        return ads;
    }

    public void setAds(String ads) {
        this.ads = ads;
    }

    public String getAdss() {
        return adss;
    }

    public void setAdss(String adss) {
        this.adss = adss;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }

    public Integer getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(Integer phoneno) {
        this.phoneno = phoneno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getComno() {
        return comno;
    }

    public void setComno(Integer comno) {
        this.comno = comno;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public Integer getComprice() {
        return comprice;
    }

    public void setComprice(Integer comprice) {
        this.comprice = comprice;
    }

    public Integer getComnu() {
        return comnu;
    }

    public void setComnu(Integer comnu) {
        this.comnu = comnu;
    }

    public String getSavor() {
        return savor;
    }

    public void setSavor(String savor) {
        this.savor = savor;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getDome() {
        return dome;
    }

    public void setDome(String dome) {
        this.dome = dome;
    }

    public String getInternational() {
        return international;
    }

    public void setInternational(String international) {
        this.international = international;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getSelectItem() {
        return selectItem;
    }

    public void setSelectItem(String selectItem) {
        this.selectItem = selectItem;
    }

    public String[] getSelectValue() {
        return selectValue;
    }

    public void setSelectValue(String[] selectValue) {
        this.selectValue = selectValue;
    }
        
    
    
    // **** Result ****
    
    public String MSR_base(){
        return "MSR_Shopping_Result";
    }

}
