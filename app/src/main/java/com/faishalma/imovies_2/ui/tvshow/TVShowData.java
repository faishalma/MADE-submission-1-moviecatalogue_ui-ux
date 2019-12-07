package com.faishalma.imovies_2.ui.tvshow;

import java.util.ArrayList;

public class TVShowData {

    private static String[][] data = new String[][]{
            {
                    "Mr. Robot",
                    "Crime, Drama, Thriller ",
                    "2015",
                    "English",
                    "8.5",
                    "49m",
                    "A contemporary and culturally resonant drama about a young programmer, Elliot, who suffers from a debilitating anti-social disorder and decides that he can only connect to people by hacking them. He wields his skills as a weapon to protect the people that he cares about. Elliot will find himself in the intersection between a cybersecurity firm he works for and the underworld organizations that are recruiting him to bring down corporate America.",
                    "https://image.tmdb.org/t/p/original/oKIBhzZzDX07SoE2bOLhq2EE8rf.jpg"
            },

            {
                    "The Mandalorian",
                    " Action, Adventure, Sci-Fi",
                    "2019",
                    "English",
                    "9.1",
                    "35m",
                    "Set after the fall of the Empire and before the emergence of the First Order, we follow the travails of a lone gunfighter in the outer reaches of the galaxy far from the authority of the New Republic.",
                    "https://image.tmdb.org/t/p/original/BbNvKCuEF4SRzFXR16aK6ISFtR.jpg"
            },

            {
                    "Chernobyl",
                    "Drama, History, Thriller",
                    "2019",
                    "English",
                    "9.5",
                    "70m",
                    "The true story of one of the worst man-made catastrophes in history: the catastrophic nuclear accident at Chernobyl. A tale of the brave men and women who sacrificed to save Europe from unimaginable disaster.",
                    "https://image.tmdb.org/t/p/original/hlLXt2tOPT6RRnjiUmoxyG1LTFi.jpg"
            },

            {
                    "Breaking Bad",
                    "Crime, Drama, Thriller ",
                    "2008",
                    "English",
                    "9.5",
                    "45m",
                    "When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime.",
                    "https://image.tmdb.org/t/p/original/1yeVJox3rjo2jBKrrihIMj7uoS9.jpg"
            },

            {
                    "Sherlock",
                    " Crime, Drama, Mystery ",
                    "2010",
                    "English",
                    "9.1",
                    "90m",
                    "A modern update finds the famous sleuth and his doctor partner solving crime in 21st century London.",
                    "https://image.tmdb.org/t/p/original/f9zGxLHGyQB10cMDZNY5ZcGKhZi.jpg"
            },

            {
                    "Avatar: The Last Airbender",
                    " Animation, Action, Adventure",
                    "2005",
                    "English",
                    "9.2",
                    "25m",
                    "In a war-torn world of elemental magic, a young boy reawakens to undertake a dangerous mystic quest to fulfill his destiny as the Avatar, and bring peace to the world.",
                    "https://image.tmdb.org/t/p/original/sB8V0pQtJZ17v8FLXMOcYz6045c.jpg"
            },

            {
                    "Gravity Falls",
                    "Animation, Action, Adventure",
                    "2012",
                    "English",
                    "8.9",
                    "22m",
                    "Twin brother and sister Dipper and Mabel Pines are in for an unexpected adventure when they spend the summer helping their great uncle Stan run a tourist trap in the mysterious town of Gravity Falls, Oregon.",
                    "https://image.tmdb.org/t/p/original/oGsgxjeZ9rd20eCJsGSMGgWvl4P.jpg"
            },

            {
                    "Young Justice",
                    " Animation, Action, Adventure",
                    "2010",
                    "English",
                    "8.7",
                    "22m",
                    "Teenage superheroes strive to prove themselves as members of the Justice League.",
                    "https://image.tmdb.org/t/p/original/rWxPEE5osPoYROC4JrTTZaIbjq1.jpg"
            },

            {
                    "Rick and Morty",
                    "Animation, Adventure, Comedy",
                    "2013",
                    "English",
                    "9.3",
                    "22m",
                    "Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.",
                    "https://image.tmdb.org/t/p/original/qJdfO3ahgAMf2rcmhoqngjBBZW1.jpg"
            },

            {
                    "The Flash",
                    "Action, Adventure, Comedy",
                    "2014",
                    "English",
                    "7.8",
                    "44m",
                    "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                    "https://image.tmdb.org/t/p/original/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
            }
    };

    public static ArrayList<TVShow> getListData() {
        ArrayList<TVShow> list = new ArrayList<>();
        for (String[] aData : data) {
            TVShow tvShow = new TVShow();
            tvShow.setTitle(aData[0]);
            tvShow.setGenre(aData[1]);
            tvShow.setDate_released(aData[2]);
            tvShow.setOriginal_language(aData[3]);
            tvShow.setRating(aData[4]);
            tvShow.setRuntime(aData[5]);
            tvShow.setOverview(aData[6]);
            tvShow.setPhoto(aData[7]);
            list.add(tvShow);
        }
        return list;
    }
}
