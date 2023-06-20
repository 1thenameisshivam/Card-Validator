import javax.swing.JOptionPane;
public class Creditcardvalidator {
    public static boolean Validate(String card_no){ // Luhn algorithm
        int number_checker=0;
        int counter=0;
      for(int i=card_no.length()-1;i>=0;i--){
          int digit=(card_no.charAt(i)-'0');
          if(counter%2==0){
              number_checker+=digit;
              counter++;
          }
          else{
              digit*=2;
              int new_digit=0;
              while(digit!=0){
                  new_digit+=digit%10;
                  digit/=10;
              }
              number_checker+=new_digit;
              counter++;
          }
      }
      if(number_checker%10==0){
          return true;
      }
      else{
          return false;
        }
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Press Ok To Enter The No: ","Credit Card Validator",JOptionPane.PLAIN_MESSAGE);
        String card_no=JOptionPane.showInputDialog("Please Enter Your Card No");
        card_no=card_no.replace(" ","");
        boolean checker =Validate(card_no);

        if(checker==true){
            JOptionPane.showMessageDialog(null,"Your Card Is Valid","Credit Card Validator",JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"Your Card Is Not Valid","Credit Card Validator",JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null,"THANK FOR USING THIS SOFTWARE","DEVELOPER - ShIvAm KuMaR",JOptionPane.PLAIN_MESSAGE);
    }
}
