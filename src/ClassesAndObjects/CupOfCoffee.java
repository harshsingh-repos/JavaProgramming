package ClassesAndObjects;

class CupOfCoffee {

//    public enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}
//    public enum Type {REGULAR, DECAF, DARK_ROAST}

//    private Size size;
//    private Type type;

    private String size;
    private String type;
    private int numSugars;
    private int numCreams;
    //constructor
  public CupOfCoffee(String size, String type, int numSugars, int numCreams)
  {        this.setSize(size);
      this.setType(type);
      this.setNumSugars(numSugars);
      this.setNumCreams(numCreams);    }    //Getters (get methods)
public String getSize(){      return size;    }
public String getType() {        return type;    }
    public int getNumSugars() {        return numSugars;    }
    public int getNumCreams(){        return numCreams;    }
//Setters (set methods)
public void setSize(String size){
      if(size == null)  size = "Medium";
      size = size.trim().toLowerCase();
      //use this when user enters a String
    switch(size){
        case "small":
            case "medium":
                case "large":
                    case "extra-large":
                        this.size = size.toLowerCase();
        //String sz = size.substring(0,1).toUpperCase();
                        // this.size = sz + size.substring(1).toLowerCase();
                        break;
                        default:
                            this.size = "Medium";
    }
  }    public void setType(String type) {
      if (type == null)
          type = "Regular";
      type = type.trim().toLowerCase();
      switch (type) {
          case "regular":
              case "decaf":
                  case "dark-roast":
                      this.type = type;
                      break;
                      default:
                          this.type = "Regular";
      }    }
    public void setNumCreams(int numCreams){
      this.numCreams = numCreams;
  }
  public void setNumSugars(int numSugars){
      this.numSugars = Math.max(0, numSugars);    }
    public double getPrice(){
      switch(size.toLowerCase()){
          case "small": return 1.50;
          case "medium": return 1.75;
          case "large": return 2.10;
          case "extra-large": return 2.30;
          default: return 0.0;
      }
  }
  public void getDescription(){
      System.out.println(" " + size + " " + type + " " + numCreams + " cream, " + numSugars + " sugar.");
  }
}

