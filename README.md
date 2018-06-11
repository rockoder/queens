# Problem Statement

1. Place N queens on an NxN chess board so that none of them attack each other (the classic n-queens problem).
1. Additionally, please make sure that no three queens are in a straight line at ANY angle, so queens on A1, C2 and E3, despite not attacking each other, form a straight line at some angle.

# Build & Usage

1. Clone the repo: `git clone https://github.com/rockoder/queens.git`
1. `cd queens`
1. `./gradlew build`
1. To run pass the N queens as program argument. For ex: `./gradlew run -PappArgs=8`
