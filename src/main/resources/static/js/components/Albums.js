export default function Albums(albums) {
    console.log(albums);
    return albums
        .map(album => {
            return `

            <header>
            <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
            <nav class="nav__menu">
                <ul>
                    <p><li class="nav__menu__albums">Albums</li></p>
                    <p><li class="nav__menu__artists">Artists</li></p>
                    <p><li class="nav__menu__songs">Songs</li></p>
                </ul>
            </nav>
            <button class="menu__button"><i class="fa fa-bars"></i></button>
        </header>


            <li class="album">
            <h5 class="album__title">${album.albumTitle}</h5>
            <img class="album__image" src="${album.albumImage}"/>
            <p class="album__rating">${album.rating}</p>
            </li>
            `;
        }).join('')
        


}