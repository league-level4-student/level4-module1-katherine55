package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void getZodiac(Zodiac mine) {
		
		switch(mine) {
		
		case ARIES:{
			JOptionPane.showMessageDialog(null, "You can get a great deal accomplished if you bring work home. You could be disillusioned if you let relative in on your emotional thoughts. Exaggeration or deception coupled with overindulgence might be a problem.");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "Opportunities to make financial gains will develop through your connections with other people. Travel will be good if you are seeking knowledge. Family outings will make you feel secure and happy.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "Your versatile mind and common sense will allow you to come up with various solutions. Don't jump into investments too quickly. Look out for yourself today.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "Confusion regarding other people's money and joint ventures will come to a head. You may find it necessary to confront a situation that has gotten out of hand. Your efforts will be rewarded handsomely.");
			break;
		} 
		case LEO:{
			JOptionPane.showMessageDialog(null, "Do not let others exhaust you financially. Legal matters that have been pending may be alleviated through compromise. You may have difficulties with someone close to you.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "Be discreet and don't present your ideas until you're certain that they're foolproof. You could expand your circle of friends if you get involved in unusual activities. Someone you live with could be frustrated and upset.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "Someone you live with may cause drastic alterations in your usual routine. You can find solutions if you are willing to communicate. Much can be accomplished if you compromise.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "You will be inclined to make unwise investment choices. Elders may need your help. Get down to business and do the work yourself.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "Your accomplishments could exceed your expectations if you mix a little business with pleasure. Either way, you're up for a passionate encounter with someone special. Sign up for seminars that will expand your business awareness.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "Make sure any presentation you have is ready. You may want to take a look at the personal papers of elders in your family. You will be able to get to the bottom of things today.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "You might want to spend some time by yourself in order to decide exactly how you feel. You can learn a great deal if you listen to those who are older or more experienced. There could be opposition or temper tantrums on the home front.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "Renovations or purchases made for your home will payoff. You are best to stick to yourself today. Do something special for them.");
			break;
		}
		
		}
		
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope nem = new _00_Horoscope();
		nem.getZodiac(Zodiac.AQUARIUS);
	}
}
