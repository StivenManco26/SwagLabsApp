# Prueba técnica - Automatizador de pruebas

Este proyecto tiene como objetivo, el desarrollo de la Prueba técnica Automatizador de pruebas, ejecutada sobre la app de prueba Swag Labs.

APK: https://github.com/saucelabs/sample-app-mobile/releases

## Requisitos técnicos

* Java version 1.8.0.
* IntelliJ IDEA (version 2019.1.3 o mas reciente).
* Gradle version 7.0.
* Cucumber for Java IntelliJ Plugin (versión actualizada v191.7479.7).
* Gherkin IntelliJ Plugin (versión actualizada v191.6707.7).
* Android Studio 4.2.1 with Android Virtual Device Manager
* Android emulador 30.6.5
* Android SDK 31.0.2
* Emulador: Pixel 4 con Android 11.0 (Google Play)
* Appium desktop server version 1.21.0

## Instalación

* clonar el repositorio localmente con el comando:
```bash
git clone https://github.com/StivenManco26/SwagLabsApp.git
```
* Se debe importar el proyecto en IntelliJ como Gradle.

## Ejecución escenarios automatizados

* Crear y correr el dispositivo virtual Pixel 4 con Android 11.0 (Google Play), a través de Android Virtual Device Manager.

* Realizar la descarga e instalación de la APK Swag Labs en el dispositivo emulado.

* Ejecutar el servidor de Appium desktop con los datos:
- Host: 0.0.0.0
- Port: 4723

* Se debe ejecutar el Feature implementado (buy_product.feature) directamente desde IntelliJ, a través del runner el cuales se encuentra en la ruta:
```bash
SwagLabsApp\src\test\resources\features\buy_product.feature
```

* Se da clic derecho sobre el runner a ejecutar, y posteriormente selecciona la opción 'Run'.

## Autor
Stiven Manco Valencia - manco.5@hotmail.com