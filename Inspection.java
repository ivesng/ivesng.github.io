package com.lkc.lkc.entities;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Getter
public class Inspection {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private int alternateur, radiateur, demarreur, filtre_a_air, pompe_d_injection, collecteur_d_admission, echappement, support_moteur, filtre_a_air_vidage,
            verification_joint, huile_sae, durites, fuites_sous_carter_oteur, niveau_de_boitier_direction, niveau_reservoir_frein, niveau_reservoir_embrayage, niveau_reservoir_lave_vitre, niveau_radiateur,
            soufflage, cde_bte_itesse, poignee_de_portes, charnieres_de_portes, arrets_de_portes, cales_de_fermeture_portes, charnieres_capot, articulation, ouverture_coffre_arriere, pene_fermeture_coffre_arriere,
            etat, niveau, polatite, fixation, assecher, vaseliner, carter_moteur, huile_sae_quantite, indicateur_tableau_de_bord, clignoteurs, charge_alternateur, lampe_temoin_niveau_huile_moteur, pression_huile, moteur_essuie_glace,
            klaxon, course_frein_de_stationnement, glicluers_essuie_glaces, antivol, phares, stop, feu_de_position, levier_vitesse, lampes_ar, temperature_moteur, carrosserie, inventaire_cric, extincteur,trousse_de_secours, triangle, marque_dimens, jante_av_dr, jante_av_g, jante_ar_dr, jante_ar_g,
            serrrage_ecrous_de_roues_couple, crochet_de_remorquage,etat_balais_essuie_glace,compression_cylindres,embrayage,interieur,exterieur,echantillon_huile_moteur,carter_moteur_vidange,boite_de_vitesse,boite_de_transfert,
            pont_avant, pont_arriere,boite_de_vitesse_controle_niveau, boite_de_transfert_controle_niveau, pont_avant_controle_niveau, pont_arriere_controle_niveau, pieds, stationnement, transmission, cardans,support_roulement,rotules,
            barre_accoupt,fusees, barre_de_direction_jeu, rotules_pivotement,suspension_avant,amortisseurs,ecrou_de_fixation_sup,silent_bloc,silent_bloc_moteur,suspension_ar,jumelles_et_attaches,articulaltion_etries,axes_ressort,bras_de_force,stabilisateur,
            etat_carburant, tuyauterie, bloquer, bouchon_reservoir,couple,pivots_de_fusees,rotules_graisser,pedaliers,cadrans,spheres_de_reaction,roulement_transmission,cde_frein_a_main,
            fuite_d_huile_roues,fuite_d_huile_cylindre_recepeteur_embrayage,fuite_d_huile_cylindre_emetteur_embrayage, reglage_soupapes,reglage_ralenti,reglage_pincage,carrossage,reglage_projecteurs,jeu_volant,
            pedale_de_frein,garde_embrayage,bouchon_radiateur,niveau_jauge_moteur,bouchon_remplissage_huile_moteur,fonct_indicateur_tableau_de_bord,pt_de_vue_code_de_la_roule,essai_sur_route,souffler_le_filtre_a_air,remplicement_cartouche_filtre_a_huile_moteur,
            vidange_boite_de_vitesse_5000,quantite,verification_ferrodonde_frein,roues_ar,ressserrage_culasse_couple_a_chaud,ressserrage_culasse_couple_a_froid,reglage_soupapea_ad,ech,vidange_pont_arriere_sae,quantite_4000;
    private String plaque;
}
