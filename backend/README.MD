# WlaNMe - Backend

Bienvenue dans le backend de WlaNMe, une application de messagerie moderne, sécurisée et évolutive. Cette API, développée avec Spring Boot, utilise MongoDB pour une gestion efficace des données.

## 🚀 Fonctionnalités principales

* Gestion des utilisateurs (inscription, connexion, mise à jour de profil).
* Messagerie en temps réel (envoi et réception de messages).
* Notifications push pour les nouveaux messages.
* Gestion des contacts (ajout, suppression, blocage).
* Sécurité renforcée avec JWT pour l’authentification.

## 🛠️ Technologies utilisées

* Java 23 : Langage principal.
* Spring Boot : Framework pour le backend.
* Spring Security : Gestion de l’authentification et de l’autorisation.
* Spring Data MongoDB : Intégration avec MongoDB.
* MongoDB : Base de données NoSQL.
* Lombok : Réduction de la verbosité du code.
* Maven : Gestionnaire de dépendances

## 📋 Prérequis

Avant de commencer, assurez-vous d’avoir :

* Java 17 ou plus installé.
* Maven ou Gradle configuré.
* Une instance MongoDB opérationnelle.
* Un outil comme Postman pour tester les endpoints.

## ⚙️ Installation et démarrage

1. Clonez le dépôt :

    ```{bash}
        git clone https://github.com/didieraitondji/wlanme-app.git
        cd wlanme/backend
    ```

2. Configurez votre base de données MongoDB dans le fichier application.properties :

    ```{bash}
        spring.data.mongodb.uri=mongodb://localhost:27017/wlanme_db  
        spring.security.jwt.secret=VOTRE_SECRET
    ```

3. Installez les dépendances et lancez le projet :

    ```{bash}
        mvn clean install  
        mvn spring-boot:run
    ```

4. L'API est maintenant accessible sur [http://localhost:8787].
