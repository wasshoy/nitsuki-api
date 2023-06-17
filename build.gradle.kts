plugins {
	java
	id("org.springframework.boot") version "3.1.0"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "jp.wasshoy"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	// FIXME: JPA のアクセスが可能になったら消す
	// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter
	implementation("org.springframework.boot:spring-boot-starter:3.1.0")
	// implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	// https://mvnrepository.com/artifact/org.assertj/assertj-core
    testImplementation("org.assertj:assertj-core:3.24.2")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
