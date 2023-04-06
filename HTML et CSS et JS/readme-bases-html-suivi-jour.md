# HTML

## Qu'est-ce que HTML ?
	Hyper Text Markup Language 
	est un ensemble de balises qui permet de décrire le contenu d'une page web
	pour les navigateurs, les moteurs de recherche, et les outils d'accessibilités
    HTML donne un "sens" au contenu affiché sur une page web.
    
   Voir PDF "introduction" et nos premiers pas sur HTML et CSS  
 - L'outil inspecteur,   
 - la structure HTML d'une page,   
 - réer une 1ere page avec du contenu et une touche de CSS  

## Les bases à retenir

### HTML  > La structure d'une page HTML 
    <!DOCTYPE  html>
	    <html>
		    <head>...</head>
		    <body>...</body>
    </html>
    
### HTML > head
Qu'y a-t-il dans l'en-tête d'une page HTML ?  
- La balise **title** permet de renseigner le titre de l'onglet dans ne le navigateur.  
- Les balises **meta** permettent de renseigner des métadonnées comme l'encodage UTF-8 ou la description de la page lisible par les moteurs de recherche.  
- Les liens du/des **fichiers CSS** et les liens du/des **fichiers JS**  
[https://developer.mozilla.org/fr/docs/Learn/HTML/Introduction_to_HTML/The_head_metadata_in_HTML](https://developer.mozilla.org/fr/docs/Learn/HTML/Introduction_to_HTML/The_head_metadata_in_HTML)

### HTML > Les balises courantes de contenus textes, liens, images, multimédia
- h1-h6, p, ul, ol, a, img (balises de contenu titre, paragraphe, listes, liens et image)
- video, audio (balises de contenu multimédia)
- i, bold (balises permettant d'ajouter du style, ici italic et gras)  
[https://developer.mozilla.org/fr/docs/Web/HTML/Element#:~:text=Le%20contenu%20HTML%20textuel%20permet,identifier%20le%20sens%20du%20contenu](https://developer.mozilla.org/fr/docs/Web/HTML/Element#:~:text=Le%20contenu%20HTML%20textuel%20permet,identifier%20le%20sens%20du%20contenu)


### HTML > Les balises de structure
Pour créer de la struture dans une page web nous pouvons utiliser des balises spéciques qui ont du sens.
- Balises sémantique : section, nav, header, main, article, aside, footer, strong, em
- Balise non-sémantique : div, span, b, i

### HTML > notion de display:block et display:inline
- **display: block** transforme l'élément en élément de type bloc qui s'insère dans le flux en prenant tous l'espace horizontal disponible avec un saut de ligne avant et après

- **display: inline** transforme l'élément en élément de type inline qui s'insère dans le flux en prenant uniquement son porpre espace, ainsi l'élément HTML suivant apparaîtré sur la même ligne juste après
NB : on ne peut pas définir de propriété width sur un élément en display:inline

- **display: inline-block** idem display:inline, mais on peut définir une taille avec width et height

Par défaut des balises HTML sont en **display:block** et d'autres balises sont en **display:inline** 
h1-h6, p, ul, li, blockquote sont en display:block, alors que a, strong, em, img, sont en display:inline

On peut modifier ce comportement natif d'une balise en modifiant le style CSS .

Lire : 
- PDF 1 : HTML - Basics
- PDF 2 : CSS : Basics


## CSS
Le CSS pour Cascading Style Sheets, est un langage informatique utilisé sur Internet pour la mise en forme de fichiers et de pages HTML. On le traduit en français par feuilles de style en cascade.
[https://developer.mozilla.org/fr/docs/Learn/CSS/First_steps/What_is_CSS](https://developer.mozilla.org/fr/docs/Learn/CSS/First_steps/What_is_CSS)

### CSS > Syntaxe

    cible {
    	propriété1 : valeur;
    	propriété2 : valeur;
    }
### CSS > Exemples
	/* ici on cible les balises p */
    p {
    	color : blue;
    	font-size : 18px;
    	font-family: Arial
    }
    
    /* Ici on cible tous les descendants li dans le parent ul */
    ul li {
		color: orange;
		list-style: none
	}

### CSS > propriétés CSS courantes sur le texte
**font-size** permet de gérer la taille de la police,   
**font-family** permet de gérer le style de la police,   
**font-weight** permet de gérer la graisse de la police,  
**color** permet de gérer la couleur du texte,   
**letter-spacing: 0.5px** permet de gérer l'espace entre les lettres,   
**line-height: 1.5em** permet de gérer la hauteur de ligne,   
**text-shadow: 1px 1px 3px black**  permet d'ajouter des ombres au texte (offsetX, offsetY, blur, color)  
**text-align** permet d'aligner du texte (left, right, center, justify)  

### CSS > propriétés CSS courantes décoratives
**background** pour changer la couleur de fond  
**background-image** pour ajouter une image de fond ou un dégradé de couleurs  
**background-position**, **background-size**, **background-repeat**  pour gérer le positionnement de l'image de fond  
**filter** permet d'ajouter des filtre de type blur, hue, grayscale, ...  
**border** (ou border-width, border-color et border-style) permet d'ajouter une bordure à un élément  
**border-radius** permet d'ajouter des coins arrondis à un élement  

### CSS  > les marges
**margin** permet d'ajouter des marges extérieures à un élément  
**padding** permet d'ajouter des marges intérieures à un élément  

    h1 {
    	margin: 20px; // applique des marges extérieures de 20px en haut, bas, gauche et droite
    }
    h2 {
    	margin: 5px 15px; // applique des marges extérieures de 5px en haut/bas et 15px à gauche/droite
    }
    p {
    	padding: 7px; // applique des marges intérieures de 7px en haut/bas, gauche/droite
    }
    

### CSS > Positionnements

||  position  |                             |
|-|-----------|-----------------------------|
|-|`relative` | positionne l'élément par rapport à lui-même            |
|-|`absolute` | positionne l'élément par rapport au 1er élément parent positionné, à défaut par rapport au coins supérieur de la page           |
|-|`fixed`    | positionne l'élément de manière fixe sur la page en le sortant du flux naturel HTML
|-|`sticky`   | l'élément est placé dans le flux et deviend "collant" au scroll




