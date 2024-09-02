## O que esse projeto faz?
Este projeto em Java 11 foi desenvolvido com o objetivo de transformar esquemas XML (XSD) em classes Java de maneira eficiente e intuitiva. Com foco em simplicidade e robustez, o conversor permite a geração automática de classes a partir de definições XSD, facilitando a integração e o uso de estruturas XML dentro do ecossistema Java.

## O que preciso para rodar?
- Apenas o Java 11 na sua maquina ou no intellij

## Como converter?
- Rode o comando ```mvn clean install```

## Para onde vao os arquivos gerados?
- Vai ser criada a pasta target, dentro dele vamos em generated > src > main > br > com > me > model
  - E ali vão estar as classes java geradas a partir do .xsd

## Como faço para gerar um .xsd diferente?
-

## Links
- https://medium.com/@ankithahjpgowda/convert-xsd-files-to-java-classes-ee1834350549
- https://github.com/oldfr/convert-xsd-to-java/blob/master/pom.xml