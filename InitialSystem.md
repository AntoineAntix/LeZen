# Conception du système initial

Notre projet est un jeu en ligne à plusieurs dans lequel chacun conduit un petit rover qui se déplace sur Mars avec des obstacles. La ma p a une taille de 10000 cases (100x100). Cela permet aux joueurs de leur laisser du temps pour se trouver. Ce jeu est comparable à Word of tanks mais ici avec un affichage en 2D.

Le jeu fonctionne au tour par tour. Cela permet à chaque joueur de voir les actions des autres. Le système de tour à tour est comparable au jeu Worms. A chaque jour, le joueur peut effectuer 5 actions parmi les suivantes :
- Avancer
- Reculer
- Tourner à gauche
- Tourner à droite
- Tirer

L'état de chaque joueur ainsi que le jeu en lui-même sont stocké sur le serveur. A chaque tour, les données se mettent à jour pour la partie en cours. Les données seront stockées sur un serveur principal et chaque partie aura une sauvegarde sur un serveur de secours en cas de panne. Si le serveur plante, un code erreur est retournée sur l’écran. Le serveur sera rebooté et les parties reprendront là où les sauvegardes ont été effectuées.

Pour gérer plusieurs parties en même temps, il y aura différentes instances générées sur le serveur. Chaque partie aura son système de tour à tour dans lequel le tour du joueur suivant commence quand celui du joueur actuel se finit.

Les joueurs s’authentifient à l'aide d'un couplage utilisateur et mot de passe. Sur le server principal, la charge de joueurs imprévue est gérée avec un limitation de 50 joueurs par partie et de 2 parties en parallèles au maximum pour l’instant. Le 101ème joueur ainsi que les suivants qui rejoindront le serveur auront un message d'erreur indiquant qu'il y a trop de joueurs.

*This documentation is written in French. 
Please contact the contributors for more information.*
