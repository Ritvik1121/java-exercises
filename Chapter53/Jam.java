public class Jam{

  String contents ;
  String date  ;
  int capacity ;



  public Jam( String contents, String date, int size ){
    this.contents = contents  ;
    this.date = date ;
    this.capacity = size;
  }

  public boolean empty (){
    return ( capacity== 0 ) ;
  }

  public String toString(){
    return this.contents + "   " +  this.date + "   " +  this.capacity + " fl. oz."  ;
  }

  public void spread ( int fluidOz ){
    if ( !empty() ){
      if ( fluidOz <= this.capacity ){

        System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents );
        this.capacity = this.capacity - fluidOz ;
      }
      else{
        System.out.println("Spreading " + capacity + " fluid ounces of " + contents );
        this.capacity =  0 ;
      }
     }
     else{
       System.out.println("No jam in the Jar!");
     }
  }

}
