
Sprint Web

Sprint DATA JPA

H2 Database

Thymeleaf

Sprint Boot DevTools


Avec quelle partie du code avons-nous param´etr´e l’url d’appel /greeting ?
	a la ligne: @GetMapping ("/greeting")
 
Avec quelle partie du code avons-nous choisi le fichier HTML `a afficher ?
	à la partie:
	 return "greeting";,
		
Comment envoyons-nous le nom `a qui nous disons bonjour avec le second lien ?
 on envoit le nom en faisant: model.addAttribute("nomTemplate", nameGET);
 
 on dit bonjour à: nomTemplate(par defaut word) mais lorsqu'on ajoute un paramètre il prend le nom de ce paramètre comme Bonjour ENSIM

etape17: oui j'ai remarqué une différence, la table adresse a été ajouter ainsi que ses attributs

etape18: la table est apparue grâce à l'utilisation de l'annotation @Entity

etape20: lorsqu'on fait une requête SELECT sur la table Adresse on voit tout le contenu du data.sql

etape23: l'annotation @Autowired  permet de spécifier une variable d'instance à renseigner par Spring.

etape30: par copie du lien dans le header du fichier html



https://rpouiller.developpez.com/tutoriels/spring/application-web-spring-hibernate/#LI-A

https://spring.io/guides/gs/serving-web-content/


change jdbc url with: jdbc:h2:mem:testdb 