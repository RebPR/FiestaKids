# StocksPortfolioAppKotlin

# Overview of App: 
https://user-images.githubusercontent.com/23514932/182270048-3e64eae0-e570-4326-9273-42bb1b222697.mov

# The architectural approach you took and why
- Used MVVM architecture. This allows us to keep code modular and reusable. ViewModals help in caching the data. In cases when phone configuration changed and view is recreated. We do not have to make the network call again as data is cached in the view modal.
- MVVM architecture keeps code modular. This enables us to test each module separately.
- The project is even easier to maintain and scale
- Future divided the directories feature wise. This helps when we try to scale the app and add more features.

# The trade offs you made and why
- Decided to go with View modal instead of Jetpack compose. This would increase the apk size. Reason being jetpack compose is still in Beta and making network calls did not seem as straight forward as I hoped.

# How to run your project
-