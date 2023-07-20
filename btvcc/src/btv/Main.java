package btv;
import btv.lexer.*;
import btv.node.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "teste/pilha.btv";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
			Token token;
			while(!((token = lexer.next()) instanceof EOF)) {
				String str_token = token.toString();
				if (token instanceof TVazio){
					continue;
				}
				System.out.println(token.getClass() + " -> ( " + str_token + " )\n");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}