Understood — here is a clean **README.md** without ANY code, ready for GitHub.

---

# 🔐 Live Coding – Spring Security Stateful

### Mise en place d’un système d’authentification stateful avec Spring Security et un formulaire de login

---

## 🎯 Objectif du Projet

Ce projet a pour but de construire une petite application interne appelée **Mini-Backoffice**, permettant :

* 🔑 De se connecter via un **formulaire de login**
* 🌍 D’accéder à une **page publique** (`/public`)
* 🏠 D’accéder à une **page protégée** (`/home`) uniquement après authentification
* 👤 D’afficher le nom de l’utilisateur connecté dans la page sécurisée

---

## 🏗️ Contexte

L’entreprise souhaite sécuriser un espace interne simple.
L’application doit :

* Utiliser **Spring Security** de manière *stateful*
* Gérer une session utilisateur avec **JSESSIONID**
* Offrir une expérience d’authentification classique via **formulaire**
* Comporter des pages publiques et protégées

---

## 🛠️ Technologies Utilisées

* Java 17
* Spring Boot 3
* Spring Web
* Spring Security
* Thymeleaf
* Maven

---

## 📂 Structure Fonctionnelle du Projet

L’application comporte :

### 📌 1. Trois pages HTML

* **/login** → formulaire de connexion
* **/public** → page accessible librement
* **/home** → page sécurisée avec message personnalisé

### 📌 2. Une configuration Spring Security

* Authentification via formulaire
* Redirection automatique vers `/home` après connexion
* Sessions gérées via *SessionCreationPolicy.IF_REQUIRED*
* Accès libre à `/public` et `/login`
* Accès protégé pour toutes les autres pages

### 📌 3. Un utilisateur en mémoire

* Nom d’utilisateur : **admin**
* Mot de passe : **admin123**
* Rôle : **ADMIN**

### 📌 4. Un contrôleur MVC

* Pour afficher les pages
* Pour injecter le nom d’utilisateur dans la vue `/home`

---

## 🚀 Fonctionnement Général

1. L’utilisateur visite `/public` → accessible librement
2. Il va sur `/home` → il est redirigé automatiquement vers `/login`
3. Il saisit ses identifiants
4. S’il réussit, il est redirigé vers `/home`
5. La page affiche : **"Bienvenue, [username]"**
6. Une session est créée avec **JSESSIONID** dans les cookies

---

## ▶️ Lancement de l'Application

* Compiler le projet avec Maven
* Lancer l’application
* Accéder aux pages via :

    * `/public`
    * `/login`
    * `/home`

---

## 👤 Identifiants de Connexion

| Champ        | Valeur   |
| ------------ | -------- |
| **Username** | admin    |
| **Password** | admin123 |
| **Role**     | ADMIN    |

---

## 📸 Screenshots (à ajouter)

Créer un dossier `docs/` et placer les captures suivantes :

* **login.png** – Page de connexion
* **public.png** – Page publique
* **home.png** – Page protégée affichant le nom de l'utilisateur
* **session.png** – Cookie JSESSIONID dans le navigateur

Ensuite, ajouter dans le README (une fois les images placées) :

```
![Login Page](docs/login.png)
![Public Page](docs/public.png)
![Home Page](docs/home.png)
![Session Cookie](docs/session.png)
```

---

## ✍️ Auteur

**Mahjoub Cherkaoui**
📧 [mahjoubcherkaoui@gmail.com](mailto:mahjoubcherkaoui@gmail.com)
💼 GitHub : [https://github.com/Mahjoubech](https://github.com/Mahjoubech)

---

If you want, I can generate a **ZIP of the entire project structure**, the HTML pages, or the folder `docs/` with placeholder images.
