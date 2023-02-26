package SeleniumLearning;

public class D_CustomXpath {

/*
1. Property
Syntax: //htmltag[@Property='value']
E.g.://button[@class="button-1 login-button"]

2.Properties
Syntax: //htmltag[@Property='value' and @Property='value']
E.g.://button[@type="submit" and @class="button-1 login-button"]

3.Using Contain() in xpath
Syntax: //htmltag[contains(@Property, 'value')]
E.g.://button[contains(@class, 'button-1 login-button')]

4.With and without contains
Syntax: //htmaltag[@Property='value' and contains(@Property, 'Value')]
//button[@type='submit' and contains(@class, 'button-1 login-button')]

5.text()
Syntax: //htmltag[text()='value']
E.g.://a[text()='Apply for vendor account']
 */

    public static void main(String[] args) {

    }
}
