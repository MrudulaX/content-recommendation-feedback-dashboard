# Content Recommendation Feedback Dashboard

## Project Description

The Content Recommendation Feedback Dashboard is a web-based application that collects, manages, and analyzes user feedback on recommended content.

The dashboard helps administrators and stakeholders understand user feedback, identify trends, and monitor recommendation performance.

## Tech Stack

- Java
- Spring Boot
- Maven
- HTML
- CSS
- JavaScript
- H2 / MySQL
- JUnit
- Selenium
- Git & GitHub
- Jenkins

## Planned Features

- Submit content feedback
- View feedback records
- Filter feedback
- Analyze feedback statistics
- Dashboard with KPIs
- Feedback severity tracking
- Data visualization
- Automated testing
- CI/CD pipeline

## How to Run Locally

1. Clone the repository.
2. Open the project in VS Code or IntelliJ.
3. Make sure Java and Maven are installed.
4. Run the Spring Boot application.
5. Open the application in the browser.

## Branching Strategy

- `main` – stable and deployable code
- `develop` – integration branch
- `feature/<name>` – new features
- `bugfix/<name>` – bug fixes
- `release/<version>` – release preparation

## Commit Convention

Commits follow this format:

`<type>: <short description>`

Examples:

- `feat: add feedback entity`
- `fix: correct severity filter`
- `docs: update README`
- `test: add feedback service tests`
- `chore: update project structure`

## Pull Request Rules

- No direct commits to `main`
- Features should be developed in feature branches
- Pull requests should be reviewed before merging
- PR descriptions should explain changes and testing

## Testing

Unit tests will be written using JUnit.

UI testing will be performed using Selenium.
Jenkins CI trigger test

## CI/CD

Jenkins will be used for automated build and testing.

## Screenshots

Project screenshots will be added to the `screenshots/` folder.

## Author

Mrudula Patil