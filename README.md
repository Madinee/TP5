Sprint Web
  permet de communiquer facilement avec les APIs web
Sprint DATA JPA
  permet d'utiliser le sql et les bases de données
H2 Database
  systeme de gestion des bases de données relationnelles ecrit en java
Thymeleaf
   utilisé en java afin de generer des pages web en html
Sprint Boot DevTools
   offre des outils de developpement en plus
Hibernate
  permet une connection et une relation avec la base de données 
 
etape13:
Avec quelle partie du code avons-nous param´etr´e l’url d’appel /greeting ?
	a la ligne: @GetMapping ("/greeting")
 
Avec quelle partie du code avons-nous choisi le fichier HTML `a afficher ?
	à la partie:
	 return "greeting";,
		
Comment envoyons-nous le nom `a qui nous disons bonjour avec le second lien ?
 on envoit le nom en faisant: @RequestParam(name="nameGET", required=false, defaultValue="World")
 
 on dit bonjour à: nomTemplate(par defaut word) mais lorsqu'on ajoute un paramètre il prend le nom de ce paramètre comme Bonjour ENSIM

etape17: oui j'ai remarqué une différence, la table adresse a été ajouté ainsi que ses attributs

etape18: la table est apparue grâce à l'utilisation de l'annotation @Entity. les autres annotation ont permi de specifier les colonne de latable

etape20: lorsqu'on fait une requête SELECT sur la table Adresse on voit tout le contenu du data.sql

etape23: l'annotation @Autowired  permet de spécifier une variable d'instance à renseigner par Spring.
         il permet aussi de faire l’injection de dépendances entre les beans de l’application

etape30: par copie du lien dans le header du fichier html



https://rpouiller.developpez.com/tutoriels/spring/application-web-spring-hibernate/#LI-A

https://spring.io/guides/gs/serving-web-content/


change jdbc url with: jdbc:h2:mem:testdb 