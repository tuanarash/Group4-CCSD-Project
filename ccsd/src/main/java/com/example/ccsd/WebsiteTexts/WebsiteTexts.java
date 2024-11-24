package com.example.ccsd.WebsiteTexts;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "WebsiteTexts")

public class WebsiteTexts {


    @Id
    private String id;
    private String title;  // Matches setTitle in AddWebsiteText.jsx
    private String content;
    private String postShortDescription; // Matches setPostShortDescription in AddWebsiteText.jsx
    private String tag; // Matches setTag in AddWebsiteText.jsx
    private String status; // Matches setStatus in AddWebsiteText.jsx
    private String place; // Matches setPlace in AddWebsiteText.jsx
    private String date; // Matches setDate in AddWebsiteText.jsx
    private String postSlug; // Matches setPostSlug in AddWebsiteText.jsx
    private String image; // Matches setImage in AddWebsiteText.jsx

    public WebsiteTexts() {}

    // Constructor
    public WebsiteTexts(String id, String title, String headerText, String footerText, String bodyText,
                        String postShortDescription, String tag, String status, String place,
                        String date, String postSlug, String image, String content) {
        this.id = id;
        this.postShortDescription = postShortDescription;
        this.tag = tag;
        this.title = title;
        this.postSlug = postSlug;
        this.content = content;
        this.status = status;
        this.date = date;
        this.image = image;
        this.place = place;
    }

    // Getters and Setters
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}

    public String getPostShortDescription() {return postShortDescription;}
    public void setPostShortDescription(String postShortDescription) {this.postShortDescription = postShortDescription;}

    public String getTag() {return tag;}
    public void setTag(String tag) {this.tag = tag;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public String getPlace() {return place;}
    public void setPlace(String place) {this.place = place;}

    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}

    public String getPostSlug() {return postSlug;}
    public void setPostSlug(String postSlug) {this.postSlug = postSlug;}

    public String getImage() {return image;}
    public void setImage(String image) {this.image = image;}
}
    /*@Id
    private String id;
    private String titleText;
    private String headerText;
    private String footerText;
    private String bodyText;
    private long contactNum;
    
    public WebsiteTexts(){}

    //Constructor
    public WebsiteTexts(String titleText, String headerText, String footerText, String bodyText, long contactNum){
        this.titleText = titleText;
        this.headerText = headerText;
        this.footerText = footerText;
        this.bodyText = bodyText;
        this.contactNum =contactNum;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getTitleText() { return titleText; }
    public void setTitleText(String titleText) { this.titleText = titleText; }

    public String getHeaderText() { return headerText; }
    public void setHeaderText(String headerText) { this.headerText = headerText; }

    public String getFooterText() { return footerText; }
    public void setFooterText(String footerText) { this.footerText = footerText; }

    public String getBodyText() { return bodyText; }
    public void setBodyText(String bodyText) { this.bodyText = bodyText; }

    public long getContactNum() { return contactNum; }
    public void setContactNum(long contactNum) { this.contactNum = contactNum; }
}

// Driver Class
/*public class Main {
    // main function
    public void main(String[] args)
    {
        // person object created
        Text text = new Text();
        text.setTitleText("Experience the world of creativity");
        text.setHeaderText("Global.Ai");
        text.setFooterText("Interested? Contact US | In Collaboration with :");
        text.setBodyText("null");
        text.setContactNum(1123456789);

        // Using methods to get the values from the
        // variables
        System.out.println(text.getTitleText());
        System.out.println(text.getHeaderText());
        System.out.println(text.getFooterText());
        System.out.println(text.getBodyText());
        System.out.println(text.getContactNum());
    }
}
}*/