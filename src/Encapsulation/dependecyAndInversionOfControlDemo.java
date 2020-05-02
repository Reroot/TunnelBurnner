package Encapsulation;

public class dependecyAndInversionOfControlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//The Inversion of Control (IoC) and Dependency Injection (DI) patterns are all about removing dependencies from your code.
//
//For example, say your application has a text editor component and you want to provide spell checking. Your standard code would look something like this:

//public class TextEditor {
//
//    private SpellChecker checker;
//
//    public TextEditor() {
//        this.checker = new SpellChecker();
//    }
//}
//What we've done here creates a dependency between the TextEditor and the SpellChecker. In an IoC scenario we would instead do something like this:

//public class TextEditor {
//
//    private IocSpellChecker checker;
//
//    public TextEditor(IocSpellChecker checker) {
//        this.checker = checker;
//    }
//}
//In the first code example we are instantiating SpellChecker (this.checker = new SpellChecker();), which means the TextEditor class directly depends on the SpellChecker class.
//
//In the second code example we are creating an abstraction by having the SpellChecker dependency class in TextEditor constructor signature (not initializing dependency in class). This allows us to call the dependency then pass it to the TextEditor class like so:
//
//SpellChecker sc = new SpellChecker; // dependency
//TextEditor textEditor = new TextEditor(sc);
//Now the client creating the TextEditor class has the control over which SpellChecker implementation to use because we're injecting the dependency to the TextEditor signature.