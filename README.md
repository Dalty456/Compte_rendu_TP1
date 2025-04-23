# TP1 – Introduction à Git (Travail en local)

**IUT du Havre – Cours GIT**  
**Nom :** [Votre nom]  
**Groupe :** [Votre groupe]  
**Année :** [Votre année]

## Objectifs

- Configurer Git
- Créer un dépôt local
- Gérer les versions de fichiers
- Comprendre les concepts de Git : zones, états, actions
- Versionner un projet Java
- Utiliser un fichier `.gitignore`

## 1. Configuration de Git

```bash
git config --global user.name "John Doe"
git config --global user.email johndoe@example.com
git config --global core.editor nano
git config --list
```

## 2. Création d’un dépôt local

```bash
mkdir -p courseGIT/tp1
cd courseGIT/tp1
git init
git status
```

## 3. Fichier README.md

Création d’un fichier `README.md` contenant les informations du TP.

```bash
git add README.md
git commit -m "Ajoute du fichier README.md"
```

Utilisation de `git status`, `git add`, `git commit` et `git log`.

## 4. Concepts clés

- **Modifié** : fichier modifié localement
- **Staged** : prêt à être validé
- **Validé** : en dépôt

Zones correspondantes : working directory, staging area, repository.

## 5. Projet Java

Création du fichier :

```bash
mkdir src
touch src/Cryptomonnaie.java
```

Contenu :

```java
public class Cryptomonnaie {
    private String nom;
    private double valeurDeJeton;

    public Cryptomonnaie(String nom, double valeurDeJeton) {
        this.nom = nom;
        this.valeurDeJeton = valeurDeJeton;
    }
}
```

Ajout au dépôt :

```bash
git add src/Cryptomonnaie.java
git commit -m "Première version du fichier Cryptomonnaie.java"
```

## 6. Fichier .gitignore

Contenu :

```
*.class
*.jar
*.war
*.nar
*.ear
*.zip
*.tar.gz
*.rar
```

Ajout et validation :

```bash
touch .gitignore
git add .gitignore
git commit -m ".gitignore ajouté"
```

## Conclusion

on a appris plusieurs bases fondamentales , dont l'utilisation de Git en local, la gestion de fichiers texte et Java, et les bonnes pratiques avec `.gitignore`.
