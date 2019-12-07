package com.faishalma.imovies_2.ui.movie;

import java.util.ArrayList;

public class MoviesData {

    private static String[][] data = new String[][]{
            {
                    "Avengers: Infinity War",
                    "Action, Adventure, Sci-Fi ",
                    "April 27, 2018",
                    "English",
                    "8.5",
                    "2h 29m",
                    "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                    "https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"
            },

            {"Spider-Man: Into the Spider-Verse",
                    "Animation, Action, Adventure",
                    "December 14, 2018",
                    "English",
                    "8.4",
                    "1h 57m",
                    "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                    "https://image.tmdb.org/t/p/original/3cZn1k8x0bikrDKEy9ZKJ6Vdj30.jpg"
            },

            {"Dragon Ball Super: Broly",
                    "Animation, Action, Adventure",
                    "January 16, 2019",
                    "Japanese",
                    "7.9",
                    "1h 41m",
                    "Earth is peaceful following the Tournament of Power. Realizing that the universes still hold many more strong people yet to see, Goku spends all his days training to reach even greater heights. Then one day, Goku and Vegeta are faced by a Saiyan called 'Broly' who they've never seen before. The Saiyans were supposed to have been almost completely wiped out in the destruction of Planet Vegeta, so what's this one doing on Earth? This encounter between the three Saiyans who have followed completely different destinies turns into a stupendous battle, with even Frieza (back from Hell) getting caught up in the mix.",
                    "https://image.tmdb.org/t/p/original/f03YksE4NggUjG75toz4H1YAGRf.jpg"
            },

            {"Deadpool",
                    "Action, Adventure, Comedy",
                    "February 12, 2016",
                    "English",
                    "8.0",
                    "1h 48m",
                    "Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life.",
                    "https://image.tmdb.org/t/p/original/inVq3FRqcYIRl2la8iZikYYxFNR.jpg"
            },

            {"Aquaman",
                    "Action, Adventure, Animation, Science Fiction, Comedy",
                    "December 21, 2018",
                    "English",
                    "7.0",
                    "2h 24m",
                    "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                    "https://image.tmdb.org/t/p/original/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"
            },

            {"How to Train Your Dragon: The Hidden World",
                    "Action, Adventure, Animation",
                    "February 22, 2019",
                    "English",
                    "7.5",
                    "1h 44m",
                    "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                    "https://image.tmdb.org/t/p/original/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg"
            },

            {"Venom",
                    "Action, Sci-Fi, Thriller",
                    "October 5, 2018",
                    "English",
                    "6.7",
                    "1h 52m",
                    "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                    "https://image.tmdb.org/t/p/original/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg"
            },

            {"Glass",
                    "Drama, Sci-Fi, Thriller ",
                    "January 18, 2019",
                    "English",
                    "6.7",
                    "2h 9m",
                    "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                    "https://image.tmdb.org/t/p/original/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg"
            },

            {"A Star Is Born",
                    "Drama, Music, Romance ",
                    "October 3, 2018",
                    "English",
                    "7.7",
                    "2h 16m",
                    "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                    "https://image.tmdb.org/t/p/original/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg"
            },

            {"Bumblebee",
                    " Action, Adventure, Sci-Fi",
                    "December 21, 2018",
                    "English",
                    "6.8",
                    "1h 54m",
                    "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                    "https://image.tmdb.org/t/p/original/fw02ONlDhrYjTSZV8XO6hhU3ds3.jpg"
            }
    };

    public static ArrayList<Movies> getListData() {
        ArrayList<Movies> list = new ArrayList<>();
        for (String[] aData : data) {
            Movies movie = new Movies();
            movie.setTitle(aData[0]);
            movie.setGenre(aData[1]);
            movie.setDate_released(aData[2]);
            movie.setOriginal_language(aData[3]);
            movie.setRating(aData[4]);
            movie.setRuntime(aData[5]);
            movie.setOverview(aData[6]);
            movie.setPhoto(aData[7]);
            list.add(movie);
        }
        return list;
    }
}
