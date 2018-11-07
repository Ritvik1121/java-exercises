public class Pantry{

  Jam  jar1;
  Jam  jar2;
  Jam  jar3;
  Jam  selected;

  public Pantry( Jam jar1, Jam jar2, Jam jar3 ){
    this.jar1 = jar1;
    this.jar2 = jar2;
    this.jar3 = jar3;
    selected = null;
  }

  public Pantry(Jam jar1){
    this.jar1 = jar1;
    this.jar2 = null;
    this.jar3 = null;
    selected = null;
  }

  public Pantry(Jam jar1, Jam jar2){
    this.jar1 = jar1;
    this.jar2 = jar2;
    this.jar3 = null;
    selected = null;

  }

  public String toString(){
    String str = "";
    str += "1: " +  jar1.toString()  + "\n";
    if (this.jar2 != null){
      str += "2: " +  jar2.toString()  + "\n";
    }
    if (this.jar3 != null){
      str += "3: " +  jar3.toString()  + "\n";
    }
    return str;
  }


  public boolean select( int jarNumber ){
    if ( jarNumber == 1 && this.jar1 != null){
      selected =  jar1;
      return true;
    }

    else if ( jarNumber == 2 && this.jar2 != null){
      selected = jar2;
      return true;
    }

    else if (jarNumber ==3 && this.jar3 != null){
      selected = jar3;
      return true;
    } else {
      selected = null;
      return false;
    }
  }

  public void spread( int oz ){
    selected.spread( oz );
  }

  public void replace(Jam j, int slot){
    if(slot == 1){
      this.jam1 = j;
    }
    else if (slot == 2){
      this.jam2 = j;
    }
    else if (slot == 3){
      this.jam3 = j;
    }
  }
}
