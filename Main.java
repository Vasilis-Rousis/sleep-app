package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	
	//declaring global scenes
	SPatient pat = new SPatient("Vasilis Rousis",0);
	
	private Stage stage;
	
	VBox firstpage = page1Menu();
	Scene firstscene = new Scene(firstpage,1300,600);
	
	VBox secondpage = page2Menu();
	Scene secondscene = new Scene(secondpage,1300,600);
	
	VBox thirdpage = page3Menu();
	Scene thirdscene = new Scene(thirdpage,1300,600);
	
	VBox resultspage = resultsMenu();
	Scene resultsscene = new Scene(resultspage,1300,600);
	
	//declaring global variables
	//answers 1-4
	 int ans1=1;
	 int ans2=1;
	 int ans3=1;
     int ans4=1;
	
	//answer 5
	 int ans5a=1;
	 int ans5b=1;
	 int ans5c=1;
	 int ans5d=1;
	 int ans5e=1;
	 int ans5f=1;
	 int ans5g=1;
	 int ans5h=1;
	 int ans5i=1;
	 int ans5j=1;
	
	//answers 6-10
	 int ans6=1;
	 int ans7=1;
	 int ans8=1;
	 int ans9=1;
	 int ans10=1;
	 int ans10a=1;
	 int ans10b=1;
	 int ans10c=1;
	 int ans10d=1;
     int ans10e=1;
     
     //Page 2 Radio "array"
     RadioButton a1 = new RadioButton();RadioButton a2 = new RadioButton();RadioButton a3 = new RadioButton();RadioButton a4 = new RadioButton();
     RadioButton b1 = new RadioButton();RadioButton b2 = new RadioButton();RadioButton b3 = new RadioButton();RadioButton b4 = new RadioButton();
     RadioButton c1 = new RadioButton();RadioButton c2 = new RadioButton();RadioButton c3 = new RadioButton();RadioButton c4 = new RadioButton();
     RadioButton d1 = new RadioButton();RadioButton d2 = new RadioButton();RadioButton d3 = new RadioButton();RadioButton d4 = new RadioButton();
     RadioButton e1 = new RadioButton();RadioButton e2 = new RadioButton();RadioButton e3 = new RadioButton();RadioButton e4 = new RadioButton();
     RadioButton f1 = new RadioButton();RadioButton f2 = new RadioButton();RadioButton f3 = new RadioButton();RadioButton f4 = new RadioButton();
     RadioButton g1 = new RadioButton();RadioButton g2 = new RadioButton();RadioButton g3 = new RadioButton();RadioButton g4 = new RadioButton();
     RadioButton h1 = new RadioButton();RadioButton h2 = new RadioButton();RadioButton h3 = new RadioButton();RadioButton h4 = new RadioButton();
     RadioButton i1 = new RadioButton();RadioButton i2 = new RadioButton();RadioButton i3 = new RadioButton();RadioButton i4 = new RadioButton();
     RadioButton j1 = new RadioButton();RadioButton j2 = new RadioButton();RadioButton j3 = new RadioButton();RadioButton j4 = new RadioButton();
     //Page 2 Radio Groupings
     ToggleGroup ga = new ToggleGroup();
     ToggleGroup gb = new ToggleGroup();
     ToggleGroup gc = new ToggleGroup();
     ToggleGroup gd = new ToggleGroup();
     ToggleGroup ge = new ToggleGroup();
     ToggleGroup gf = new ToggleGroup();
     ToggleGroup gg = new ToggleGroup();
     ToggleGroup gh = new ToggleGroup();
     ToggleGroup gi = new ToggleGroup();
     ToggleGroup gj = new ToggleGroup();
     
     //Page 3 Radio array
     RadioButton q6ch1 = new RadioButton();RadioButton q6ch2 = new RadioButton();RadioButton q6ch3 = new RadioButton();RadioButton q6ch4 = new RadioButton();
     RadioButton q7ch1 = new RadioButton();RadioButton q7ch2 = new RadioButton();RadioButton q7ch3 = new RadioButton();RadioButton q7ch4 = new RadioButton();
     RadioButton q8ch1 = new RadioButton();RadioButton q8ch2 = new RadioButton();RadioButton q8ch3 = new RadioButton();RadioButton q8ch4 = new RadioButton();
     RadioButton q9ch1 = new RadioButton();RadioButton q9ch2 = new RadioButton();RadioButton q9ch3 = new RadioButton();RadioButton q9ch4 = new RadioButton();
     RadioButton q10ch1 = new RadioButton();RadioButton q10ch2 = new RadioButton();RadioButton q10ch3 = new RadioButton();RadioButton q10ch4 = new RadioButton();
     RadioButton q10ach1 = new RadioButton();RadioButton q10ach2 = new RadioButton();RadioButton q10ach3 = new RadioButton();RadioButton q10ach4 = new RadioButton();
     RadioButton q10bch1 = new RadioButton();RadioButton q10bch2 = new RadioButton();RadioButton q10bch3 = new RadioButton();RadioButton q10bch4 = new RadioButton();
     RadioButton q10cch1 = new RadioButton();RadioButton q10cch2 = new RadioButton();RadioButton q10cch3 = new RadioButton();RadioButton q10cch4 = new RadioButton();
     RadioButton q10dch1 = new RadioButton();RadioButton q10dch2 = new RadioButton();RadioButton q10dch3 = new RadioButton();RadioButton q10dch4 = new RadioButton();
     RadioButton q10ech1 = new RadioButton();RadioButton q10ech2 = new RadioButton();RadioButton q10ech3 = new RadioButton();RadioButton q10ech4 = new RadioButton();
     
     ToggleGroup g2a = new ToggleGroup();
     ToggleGroup g2b = new ToggleGroup();
     ToggleGroup g2c = new ToggleGroup();
     ToggleGroup g2d = new ToggleGroup();
     ToggleGroup g2e = new ToggleGroup();
     ToggleGroup g2f = new ToggleGroup();
     ToggleGroup g2g = new ToggleGroup();
     ToggleGroup g2h = new ToggleGroup();
     ToggleGroup g2i = new ToggleGroup();
     ToggleGroup g2j = new ToggleGroup();
	
	
	public void start(Stage primaryStage) {
		this.stage = primaryStage;
		
		//Main Menu
		VBox mainMenu = mainMenuPage();		
		Scene scene = new Scene(mainMenu,1200,600);
		
		//Adding the UI components to every scene
		addUIControlsMain(mainMenu);
		mainMenu.setStyle("-fx-background-color: rgb(252, 245, 199)");
		primaryStage.setTitle("Sleep Quality App");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
    public VBox mainMenuPage() {
        // Instantiate a new VBox
    	VBox mainMenu = new VBox();

        // Position the pane at the center of the screen, both vertically and horizontally
    	mainMenu.setAlignment(Pos.CENTER);

        // Set padding and spacing
    	
    	mainMenu.setPadding(new Insets(10, 50, 50, 50));
    	
    	mainMenu.setSpacing(100);

        return mainMenu;
    }
    
    public void addUIControlsMain(VBox mainMenu) {
    	
    	//Header
        Label headerLabel = new Label("Sleep Quality App");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        
        //Menu Message
        Label menuMessage = new Label("The following questions relate to your usual sleep habits during the past month only."
        		+ " Your answers should indicate the most accurate reply for the majority of days and nights in the past month. "
        		+ "Please answer all questions.");
        menuMessage.setFont(Font.font(18));
        
        //Start Button
        Button startButton = new Button("Start");
        
        mainMenu.getChildren().addAll(headerLabel,menuMessage,startButton);
        menuMessage.setWrapText(true);      
        
        startButton.setOnAction(p1->{
        	addUIControls1(firstpage);
        	firstpage.setStyle("-fx-background-color: rgb(252, 245, 199)");
        	stage.setScene(firstscene);
        	stage.show();
        });
    }
    
    public VBox page1Menu() {
        // Instantiate a new VBox
        VBox page1 = new VBox();

        // Position the pane at the center of the screen, both vertically and horizontally
        page1.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        page1.setPadding(new Insets(40, 40, 40, 40));


        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(200, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstraints = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstraints.setHgrow(Priority.ALWAYS);

        return page1;
    }
    
    public void addUIControls1(VBox finalbox1) {
    	
    	//Title VBox
    	VBox p1vbox = new VBox();
        Label inst1 = new Label("The following questions relate to your usual sleep habits during the past month only.");
        Label inst2 = new Label("Your answers should indicate the most accurate reply for the majority of days and nights in the past month.");
        Label inst3 = new Label("Please answer all questions.");
        p1vbox.getChildren().addAll(inst1,inst2,inst3);
        
        //Form Gridpane
        GridPane page1 = new GridPane();
        
    	TextField a1 = new TextField("0");
    	TextField a2 = new TextField("0");
    	TextField a3 = new TextField("0");
    	TextField a4 = new TextField("0");
    	page1.add(a1,1,0);
    	page1.add(a2,1,1);
    	page1.add(a3,1,2);
    	page1.add(a4,1,3);     	    	
    		
    	Label q1 = new Label("1. During the past month, when have you usually gone to bed at night?");
    	page1.add(q1,0,0);
    	q1.setWrapText(true);
    	
    	Label q2 = new Label("2. During the past month, how long (in minutes) has it usually taken you to fall asleep each night?");
    	page1.add(q2,0,1);
    	q2.setWrapText(true);
    	
    	Label q3 = new Label("3. During the past month, when have you usually gotten up in the morning?");
    	page1.add(q3,0,2);
    	q3.setWrapText(true);
    	
    	Label q4 = new Label("4. During the past month, how many hours of actual sleep did you get at night?");
    	page1.add(q4,0,3);
    	q4.setWrapText(true);   	
    	
    	Button toPage2 = new Button("Next");
    	page1.add(toPage2, 1, 4);
    	
    	toPage2.setAlignment(Pos.CENTER);
    	
    	//Master Pane
    	finalbox1.getChildren().addAll(p1vbox,page1);
    	
    	//Event handler to next page
    	toPage2.setOnAction(p2->{    		
    		
        	//Parsing TextField values
        	ans1=Integer.parseInt(a1.getText());
        	ans2=Integer.parseInt(a2.getText());
        	ans3=Integer.parseInt(a3.getText());
        	ans4=Integer.parseInt(a4.getText());
        	
    		addUIControls2(secondpage);      	
        	secondpage.setStyle("-fx-background-color: rgb(252, 245, 199)");
        	stage.setScene(secondscene);
        	stage.show();
    	});
    }
    
    public VBox page2Menu() {
        // Instantiate a new VBox
        VBox page2 = new VBox();

        // Position the pane at the center of the screen, both vertically and horizontally
        page2.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        page2.setPadding(new Insets(40, 40, 40, 40));

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(200, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstraints = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstraints.setHgrow(Priority.ALWAYS);
        
        return page2;
    }
    
    public void addUIControls2(VBox finalbox2) {    	
    	
    	//Page 2 form titles and text
        Label inst1 = new Label("For each of the remaining questions, check the one best response.");
        Label inst2 = new Label("Please answer all questions.");
        Text q5 = new Text("5. During the past month, how often have you had trouble sleeping because you ...");
        Text ans_a = new Text("(a) ... cannot get to sleep within 30 minutes");
        Text ans_b = new Text("(b) ... wake up in the middle of the night or early morning");
        Text ans_c = new Text("(c) ... have to get up to use the bathroom");
        Text ans_d = new Text("(d) ... cannot breathe comfortably");
        Text ans_e = new Text("(e) ... cough or snore loudly");
        Text ans_f = new Text("(f) ... feel too cold");
        Text ans_g = new Text("(g) ... feel too hot");
        Text ans_h = new Text("(h) ... had bad dreams");
        Text ans_i = new Text("(i) ... have pain");
        Text ans_j = new Text("(j) Other reason(s), please describe");
        Text ans_j2 = new Text("How often during the past month have you had trouble sleeping because of this?");

        Text col1lbl = new Text("Not during the past month");
        Text col2lbl = new Text("Less than once a week");
        Text col3lbl = new Text("Once or twice a week");
        Text col4lbl = new Text("Three or more times a week");
        TextField ans_j_field = new TextField();
        ans_j_field.setPrefWidth(250);
       
        
        //Radio Button Groupings
        a1.setToggleGroup(ga);
        a2.setToggleGroup(ga);
        a3.setToggleGroup(ga);
        a4.setToggleGroup(ga);

        b1.setToggleGroup(gb);
        b2.setToggleGroup(gb);
        b3.setToggleGroup(gb);
        b4.setToggleGroup(gb);

        c1.setToggleGroup(gc);
        c2.setToggleGroup(gc);
        c3.setToggleGroup(gc);
        c4.setToggleGroup(gc);

        d1.setToggleGroup(gd);
        d2.setToggleGroup(gd);
        d3.setToggleGroup(gd);
        d4.setToggleGroup(gd);

        e1.setToggleGroup(ge);
        e2.setToggleGroup(ge);
        e3.setToggleGroup(ge);
        e4.setToggleGroup(ge);

        f1.setToggleGroup(gf);
        f2.setToggleGroup(gf);
        f3.setToggleGroup(gf);
        f4.setToggleGroup(gf);

        g1.setToggleGroup(gg);
        g2.setToggleGroup(gg);
        g3.setToggleGroup(gg);
        g4.setToggleGroup(gg);

        h1.setToggleGroup(gh);
        h2.setToggleGroup(gh);
        h3.setToggleGroup(gh);
        h4.setToggleGroup(gh);

        i1.setToggleGroup(gi);
        i2.setToggleGroup(gi);
        i3.setToggleGroup(gi);
        i4.setToggleGroup(gi);

        j1.setToggleGroup(gj);
        j2.setToggleGroup(gj);
        j3.setToggleGroup(gj);
        j4.setToggleGroup(gj);
        

        
        //Title VBox
        VBox lblBox = new VBox();
        lblBox.getChildren().addAll(inst1,inst2);
        lblBox.setAlignment(Pos.CENTER);
        
        //Radio array GridPane
        GridPane qpane = new GridPane();
        qpane.setVgap(10);
        qpane.setHgap(50);

        qpane.add(q5,0,1);
        qpane.add(col1lbl,1,1);
        qpane.add(col2lbl,2,1);
        qpane.add(col3lbl,3,1);
        qpane.add(col4lbl,4,1);

        qpane.add(ans_a,0,2);
        qpane.add(a1,1,2);
        qpane.add(a2,2,2);
        qpane.add(a3,3,2);
        qpane.add(a4,4,2);

        qpane.add(ans_b,0,3);
        qpane.add(b1,1,3);
        qpane.add(b2,2,3);
        qpane.add(b3,3,3);
        qpane.add(b4,4,3);

        qpane.add(ans_c,0,4);
        qpane.add(c1,1,4);
        qpane.add(c2,2,4);
        qpane.add(c3,3,4);
        qpane.add(c4,4,4);

        qpane.add(ans_d,0,5);
        qpane.add(d1,1,5);
        qpane.add(d2,2,5);
        qpane.add(d3,3,5);
        qpane.add(d4,4,5);

        qpane.add(ans_e,0,6);
        qpane.add(e1,1,6);
        qpane.add(e2,2,6);
        qpane.add(e3,3,6);
        qpane.add(e4,4,6);

        qpane.add(ans_f,0,7);
        qpane.add(f1,1,7);
        qpane.add(f2,2,7);
        qpane.add(f3,3,7);
        qpane.add(f4,4,7);

        qpane.add(ans_g,0,8);
        qpane.add(g1,1,8);
        qpane.add(g2,2,8);
        qpane.add(g3,3,8);
        qpane.add(g4,4,8);

        qpane.add(ans_h,0,9);
        qpane.add(h1,1,9);
        qpane.add(h2,2,9);
        qpane.add(h3,3,9);
        qpane.add(h4,4,9);

        qpane.add(ans_i,0,10);
        qpane.add(i1,1,10);
        qpane.add(i2,2,10);
        qpane.add(i3,3,10);
        qpane.add(i4,4,10);
        
        HBox ansjBox = new HBox(20);
        ansjBox.getChildren().addAll(ans_j,ans_j_field);

        qpane.add(ansjBox,0,11);
        qpane.add(ans_j2,0,12);
        qpane.add(j1,1,12);
        qpane.add(j2,2,12);
        qpane.add(j3,3,12);
        qpane.add(j4,4,12);


        qpane.setAlignment(Pos.CENTER);
        
        //Button HBox
        HBox btnBox = new HBox(30);
        Button toPage1 = new Button("Previous");
        Button toPage3 = new Button("Next");
        btnBox.getChildren().addAll(toPage1,toPage3);
        btnBox.setAlignment(Pos.CENTER);
		
    	toPage1.setOnAction(p1->{
        	firstpage.setStyle("-fx-background-color: rgb(252, 245, 199)");
        	stage.setScene(firstscene);
        	stage.show();
    	});
    	
    	toPage3.setOnAction(p3->{
    		page2Radio();
    		addUIControls3(thirdpage);
    		thirdpage.setStyle("-fx-background-color: rgb(252, 245, 199)");
    		stage.setScene(thirdscene);
    		stage.show();
    	});
        
    	//Master VBox Pane
        finalbox2.getChildren().addAll(lblBox,qpane,btnBox);
    }
    
    public VBox page3Menu() {
        // Instantiate a new VBox
        VBox page3 = new VBox();

        // Position the pane at the center of the screen, both vertically and horizontally
        page3.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        page3.setPadding(new Insets(40, 40, 40, 40));

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(200, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstraints = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstraints.setHgrow(Priority.ALWAYS);
        
        return page3;
    }
    
    public void addUIControls3(VBox finalbox3) {
    	
    	//Page 3 Text and Forms
        Text q6 = new Text("6. During the past month, how would you rate your sleep quality overall?");
        Text q7 = new Text("7. During the past month, how often have you taken medicine \n(prescribed or \"over the counter\") to help you sleep?");
        Text q8 = new Text("8. During the past month, how often have you had trouble staying \nawake while driving, eating meals, or engaging in social activity?");
        Text q9 = new Text("9. During the past month, how much of a problem has it been for you \nto keep up enough enthusiasm to get things done?");
        Text q10 = new Text("10. During the past month, how much of a problem has it been for you \nto keep up enough enthusiasm to get things done?");
        Text q10b = new Text("If you have a roommate or bed partner, ask him/her how often in \nthe past month you have had ... ");

        Text q6col1 = new Text("Very good");
        Text q6col2 = new Text("Fairly good");
        Text q6col3 = new Text("Fairly bad");
        Text q6col4 = new Text("Very bad");

        Text q78col1 = new Text("Not during the past month");
        Text q78col2 = new Text("Less than once a week");
        Text q78col3 = new Text("Once or twice a week");
        Text q78col4 = new Text("Three or more times a week");

        Text q9col1 = new Text("No problem at all");
        Text q9col2 = new Text("Only a very slight problem");
        Text q9col3 = new Text("Somewhat of a problem");
        Text q9col4 = new Text("A very big problem");

        Text q10col1 = new Text("No bed partner of roomate");
        Text q10col2 = new Text("Partner/roomate in other room");
        Text q10col3 = new Text("Partner in same room, but not same bed");
        Text q10col4 = new Text("Partner in same bed");

        Text q10bcol1 = new Text("Not during the past month");
        Text q10bcol2 = new Text("Less than once a week");
        Text q10bcol3 = new Text("Once or twice a week");
        Text q10bcol4 = new Text("Three or more times a week");

        Text ans10_a = new Text("(a) ... loud snoring");
        Text ans10_b = new Text("(b) ... long pauses between breaths while asleep");
        Text ans10_c = new Text("(c) ... legs twitching or jerking while you sleep");
        Text ans10_d = new Text("(d) ... episodes of disorientation or confusion during sleep");
        Text ans10_e = new Text("(e) ... Other restlessness while you sleep; please describe");

        TextField ans10_e_field = new TextField();
        
        
        //Radio Button Groupings

        q6ch1.setToggleGroup(g2a);
        q6ch2.setToggleGroup(g2a);
        q6ch3.setToggleGroup(g2a);
        q6ch4.setToggleGroup(g2a);

        q7ch1.setToggleGroup(g2b);
        q7ch2.setToggleGroup(g2b);
        q7ch3.setToggleGroup(g2b);
        q7ch4.setToggleGroup(g2b);

        q8ch1.setToggleGroup(g2c);
        q8ch2.setToggleGroup(g2c);
        q8ch3.setToggleGroup(g2c);
        q8ch4.setToggleGroup(g2c);

        q9ch1.setToggleGroup(g2d);
        q9ch2.setToggleGroup(g2d);
        q9ch3.setToggleGroup(g2d);
        q9ch4.setToggleGroup(g2d);

        q10ch1.setToggleGroup(g2e);
        q10ch2.setToggleGroup(g2e);
        q10ch3.setToggleGroup(g2e);
        q10ch4.setToggleGroup(g2e);

        q10ach1.setToggleGroup(g2f);
        q10ach2.setToggleGroup(g2f);
        q10ach3.setToggleGroup(g2f);
        q10ach4.setToggleGroup(g2f);

        q10bch1.setToggleGroup(g2g);
        q10bch2.setToggleGroup(g2g);
        q10bch3.setToggleGroup(g2g);
        q10bch4.setToggleGroup(g2g);

        q10cch1.setToggleGroup(g2h);
        q10cch2.setToggleGroup(g2h);
        q10cch3.setToggleGroup(g2h);
        q10cch4.setToggleGroup(g2h);

        q10dch1.setToggleGroup(g2i);
        q10dch2.setToggleGroup(g2i);
        q10dch3.setToggleGroup(g2i);
        q10dch4.setToggleGroup(g2i);
        
        q10ech1.setToggleGroup(g2j);
        q10ech2.setToggleGroup(g2j);
        q10ech3.setToggleGroup(g2j);
        q10ech4.setToggleGroup(g2j);



        
        //GridPane containing Radio array
        GridPane qpane = new GridPane();
        qpane.setVgap(10);
        qpane.setHgap(50);

        qpane.add(q6col1,1,1);
        qpane.add(q6col2,2,1);
        qpane.add(q6col3,3,1);
        qpane.add(q6col4,4,1);

        qpane.add(q6,0,2);
        qpane.add(q6ch1,1,2);
        qpane.add(q6ch2,2,2);
        qpane.add(q6ch3,3,2);
        qpane.add(q6ch4,4,2);

        qpane.add(q78col1,1,3);
        qpane.add(q78col2,2,3);
        qpane.add(q78col3,3,3);
        qpane.add(q78col4, 4,3);

        qpane.add(q7,0,4);
        qpane.add(q7ch1,1,4);
        qpane.add(q7ch2,2,4);
        qpane.add(q7ch3,3,4);
        qpane.add(q7ch4,4,4);

        qpane.add(q8,0,5);
        qpane.add(q8ch1,1,5);
        qpane.add(q8ch2,2,5);
        qpane.add(q8ch3,3,5);
        qpane.add(q8ch4,4,5);

        qpane.add(q9col1,1,6);
        qpane.add(q9col2,2,6);
        qpane.add(q9col3,3,6);
        qpane.add(q9col4,4,6);

        qpane.add(q9,0,7);
        qpane.add(q9ch1,1,7);
        qpane.add(q9ch2,2,7);
        qpane.add(q9ch3,3,7);
        qpane.add(q9ch4,4,7);

        qpane.add(q10col1,1,8);
        qpane.add(q10col2,2,8);
        qpane.add(q10col3,3,8);
        qpane.add(q10col4,4,8);

        qpane.add(q10,0,9);
        qpane.add(q10ch1,1,9);
        qpane.add(q10ch2,2,9);
        qpane.add(q10ch3,3,9);
        qpane.add(q10ch4,4,9);

        qpane.add(q10b,0,10);
        qpane.add(q10bcol1,1,10);
        qpane.add(q10bcol2,2,10);
        qpane.add(q10bcol3,3,10);
        qpane.add(q10bcol4,4,10);

        qpane.add(ans10_a,0,11);
        qpane.add(q10ach1,1,11);
        qpane.add(q10ach2,2,11);
        qpane.add(q10ach3,3,11);
        qpane.add(q10ach4,4,11);

        qpane.add(ans10_b,0,12);
        qpane.add(q10bch1,1,12);
        qpane.add(q10bch2,2,12);
        qpane.add(q10bch3,3,12);
        qpane.add(q10bch4,4,12);

        qpane.add(ans10_c,0,13);
        qpane.add(q10cch1,1,13);
        qpane.add(q10cch2,2,13);
        qpane.add(q10cch3,3,13);
        qpane.add(q10cch4,4,13);

        qpane.add(ans10_d,0,14);
        qpane.add(q10dch1,1,14);
        qpane.add(q10dch2,2,14);
        qpane.add(q10dch3,3,14);
        qpane.add(q10dch4,4,14);

        qpane.add(ans10_e,0,15);
        qpane.add(q10ech1,1,15);
        qpane.add(q10ech2,2,15);
        qpane.add(q10ech3,3,15);
        qpane.add(q10ech4,4,15);

        qpane.add(ans10_e_field,0,16);

        qpane.setAlignment(Pos.CENTER);
        
        //Button HBox
        HBox btnBox = new HBox(30);
        Button toPage2 = new Button("Previous");
        Button results = new Button("Results");       
        btnBox.getChildren().addAll(toPage2,results);
        btnBox.setAlignment(Pos.CENTER);
		
    	toPage2.setOnAction(p2->{
        	secondpage.setStyle("-fx-background-color: rgb(252, 245, 199)");
        	stage.setScene(secondscene);
        	stage.show();
    	});
    	
    	results.setOnAction(r->{
    		page3Radio();
    		getOverallScore();
    		addUIControlsr(resultspage);
        	resultspage.setStyle("-fx-background-color: rgb(252, 245, 199)");
        	stage.setScene(resultsscene);
        	stage.show();
    	});
    	
    	//Master results pane
        finalbox3.getChildren().addAll(qpane,btnBox);
    }
    
    public VBox resultsMenu() {
        // Instantiate a new VBox
        VBox results = new VBox();

        // Position the pane at the center of the screen, both vertically and horizontally
        results.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        results.setPadding(new Insets(40, 40, 40, 40));

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(200, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstraints = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstraints.setHgrow(Priority.ALWAYS);
        
        return results;
    }
    
    public void addUIControlsr(VBox results) {
        Label resultstext = new Label("Patient: "+pat.getFullname()+" has score of " + pat.getScore());
        resultstext.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        results.getChildren().add(resultstext);
    }
    
    public void page2Radio() {
        //using isSelected function to parse data from every RadioBox
        if (ga.getSelectedToggle()==a1){
            ans5a=0;
        } 
        else if(ga.getSelectedToggle()==a2) {
            ans5a=1;
        } 
        else if(ga.getSelectedToggle()==a3) {
            ans5a=2;
        } 
        else if(ga.getSelectedToggle()==a4) {
            ans5a=3;
        }
        
        if (gb.getSelectedToggle()==b1) {
            ans5b=0;
        } 
        else if (gb.getSelectedToggle()==b2) {
            ans5b=1;
        } 
        else if (gb.getSelectedToggle()==b3) {
            ans5b=2;
        } 
        else if (gb.getSelectedToggle()==b4) {
            ans5b=3;
        }
        
        if (gc.getSelectedToggle()==c1) {
            ans5c=0;
        } 
        else if (gc.getSelectedToggle()==c2) {
            ans5c=1;
        } 
        else if (gc.getSelectedToggle()==c3) {
            ans5c=2;
        } 
        else if (gc.getSelectedToggle()==c4) {
            ans5c=3;
        }
        
        if (gd.getSelectedToggle()==d1) {
            ans5d=0;
        } 
        else if (gd.getSelectedToggle()==d2) {
            ans5d=1;
        } 
        else if (gd.getSelectedToggle()==d3) {
            ans5d=2;
        } 
        else if (gd.getSelectedToggle()==d4) {
            ans5d=3;
        }
        
        if (ge.getSelectedToggle()==e1) {
            ans5e=0;
        } 
        else if (ge.getSelectedToggle()==e2) {
            ans5e=1;
        } 
        else if (ge.getSelectedToggle()==e3) {
            ans5e=2;
        } 
        else if (ge.getSelectedToggle()==e4) {
            ans5e=3;
        }
        
        if (gf.getSelectedToggle()==f1) {
            ans5f=0;
        } 
        else if (gf.getSelectedToggle()==f2) {
            ans5f=1;
        } 
        else if (gf.getSelectedToggle()==f3) {
            ans5f=2;
        } 
        else if (gf.getSelectedToggle()==f4) {
            ans5f=3;
        }
        
        if (gg.getSelectedToggle()==g1) {
            ans5g=0;
        } 
        else if (gg.getSelectedToggle()==g2) {
            ans5g=1;
        } 
        else if (gg.getSelectedToggle()==g3) {
            ans5g=2;
        } 
        else if (gg.getSelectedToggle()==g4) {
            ans5g=3;
        }
        
        if (gh.getSelectedToggle()==h1) {
            ans5h=0;
        } 
        else if (gh.getSelectedToggle()==h2) {
            ans5h=1;
        } 
        else if (gh.getSelectedToggle()==h3) {
            ans5h=2;
        } 
        else if (gh.getSelectedToggle()==h4) {
            ans5h=3;
        }
        
        if (gi.getSelectedToggle()==i1) {
            ans5i=0;
        } 
        else if (gi.getSelectedToggle()==i2) {
            ans5i=1;
        } 
        else if (gi.getSelectedToggle()==i3) {
            ans5i=2;
        } 
        else if (gi.getSelectedToggle()==i4) {
            ans5i=3;
        }
        
        if (gj.getSelectedToggle()==j1) {
            ans5j=0;
        } 
        else if (gj.getSelectedToggle()==j2) {
            ans5j=1;
        } 
        else if (gj.getSelectedToggle()==j3) {
            ans5j=2;
        } 
        else if (gj.getSelectedToggle()==j4) {
            ans5j=3;
        }
    }
    
    public void page3Radio() {
        //Using isSelected function to parse data from every EadioBox
        if (g2a.getSelectedToggle()==q6ch1) {
            ans6=0;
        } 
        else if (g2a.getSelectedToggle()==q6ch2) {
            ans6=1;
        } 
        else if (g2a.getSelectedToggle()==q6ch3) {
            ans6=2;
        } 
        else if (g2a.getSelectedToggle()==q6ch4) {
            ans6=3;
        }
        
        if (g2b.getSelectedToggle()==q7ch1) {
            ans7=0;
        } 
        else if (g2b.getSelectedToggle()==q7ch2) {
            ans7=1;
        } 
        else if (g2b.getSelectedToggle()==q7ch3) {
            ans7=2;
        } 
        else if (g2b.getSelectedToggle()==q7ch4) {
            ans7=3;
        }
        
        if (g2c.getSelectedToggle()==q8ch1) {
            ans8=0;
        } 
        else if (g2c.getSelectedToggle()==q8ch2) {
            ans8=1;
        } 
        else if (g2c.getSelectedToggle()==q8ch3) {
            ans8=2;
        } 
        else if (g2c.getSelectedToggle()==q8ch4) {
            ans8=3;
        }
        
        if (g2d.getSelectedToggle()==q9ch1) {
            ans9=0;
        } 
        else if (g2d.getSelectedToggle()==q9ch2) {
            ans9=1;
        } 
        else if (g2d.getSelectedToggle()==q9ch3) {
            ans9=2;
        } 
        else if (g2d.getSelectedToggle()==q9ch4) {
            ans9=3;
        }
        
        if (g2e.getSelectedToggle()==q10ch1) {
            ans10=0;
        } 
        else if (g2e.getSelectedToggle()==q10ch2) {
            ans10=1;
        } 
        else if (g2e.getSelectedToggle()==q10ch3) {
            ans10=2;
        } 
        else if (g2e.getSelectedToggle()==q10ch4) {
            ans10=3;
        }
        
        if (g2f.getSelectedToggle()==q10ach1) {
            ans10a=0;
        } 
        else if (g2f.getSelectedToggle()==q10ach2) {
            ans10a=1;
        } 
        else if (g2f.getSelectedToggle()==q10ach3) {
            ans10a=2;
        } 
        else if (g2f.getSelectedToggle()==q10ach4) {
            ans10a=3;
        }
        
        if (g2g.getSelectedToggle()==q10bch1) {
            ans10b=0;
        } 
        else if (g2g.getSelectedToggle()==q10bch2) {
            ans10b=1;
        } 
        else if (g2g.getSelectedToggle()==q10bch3) {
            ans10b=2;
        } 
        else if (g2g.getSelectedToggle()==q10bch4) {
            ans10b = 3;
        }
        
        if (g2h.getSelectedToggle()==q10cch1) {
            ans10c=0;
        } 
        else if (g2h.getSelectedToggle()==q10cch2) {
            ans10c=1;
        } 
        else if (g2h.getSelectedToggle()==q10cch3) {
            ans10c=2;
        } 
        else if (g2h.getSelectedToggle()==q10cch4) {
            ans10c=3;
        }
        
        if (g2i.getSelectedToggle()==q10dch1) {
            ans10d=0;
        } 
        else if (g2i.getSelectedToggle()==q10dch2) {
            ans10d=1;
        } 
        else if (g2i.getSelectedToggle()==q10dch3) {
            ans10d=2;
        } 
        else if (g2i.getSelectedToggle()==q10dch4) {
            ans10d=3;
        }
        
        if (g2j.getSelectedToggle()==q10ech1) {
            ans10e=0;
        }
        else if (g2j.getSelectedToggle()==q10ech2) {
            ans10e=1;
        } 
        else if (g2j.getSelectedToggle()==q10ech3) {
            ans10e=2;
        } 
        else if (g2j.getSelectedToggle()==q10ech4) {
            ans10e=3;
        }
    }
    
    public void getOverallScore() {
    	//adding every component to Patient field "score"
    	int comp1 =pat.component1Score(ans6);
    	int comp2 =pat.component2Score(ans2,ans5a);
    	int comp3 =pat.component3Score(ans4);
    	int comp4 =pat.component4Score(ans4);
    	int comp5 =pat.component5Score(ans5b,ans5c,ans5d,ans5e,ans5f,ans5g,ans5h,ans5i,ans5j);
    	int comp6 =pat.component6Score(ans7);
    	int comp7 =pat.component7Score(ans8,ans9);
    	int sum = comp1 + comp2 +comp3 +comp4 +comp5 +comp6 +comp7;      	
    	pat.setScore(sum);

    }
     
	public static void main(String[] args) {
		launch(args);
	}
}
