package view;

import controller.Batalha;
import controller.factory.NPCFactory;
import model.NPC;
import model.Personagem;

public class Jogo {

	public static void main(String[] args) {
		
		Personagem p = new Personagem();
		p.setId(1);
		p.setNome("Azkrevtz");
		p.setEnergia(100);
		p.setNivel(2);
		p.setArma("Espada");
		
		NPCFactory npc = new NPCFactory();
		Batalha bat = new Batalha();
		bat.inicioBatalha(p);
		NPC npcBatalha = npc.npcsBatalha(p);
		System.out.println(npcBatalha.toString());
	}
	
}
